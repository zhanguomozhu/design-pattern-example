package com.dyq.design.design.pattern.example.structural_mode.flyweight_pattern;


import java.util.HashMap;

/**
 * 图形工厂
 */
public class ShapeFactory {
	   private static final HashMap<String, Shape> circleMap = new HashMap<>();
	   public static Shape getCircle(String color) {
	      Circle circle = (Circle)circleMap.get(color);	 
	      if(circle == null) {
	         circle = new Circle(color);
	         circleMap.put(color, circle);
	         System.out.println("创建了" + color + "的圆");
	      }
	      return circle;
	   }
}
