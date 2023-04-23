package com.dyq.design.design.pattern.example.structural_mode.flyweight_pattern;


/**
 * 享元模式
 */
public class Test {
	private static final String colors[] = 
	      { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i < 15; ++i) {
	         Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
	         circle.setX(getRandomX());
	         circle.setY(getRandomY());
	         circle.setRadius(100);
	         circle.draw();
	      }
	   }
	   private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	   }
	   private static int getRandomX() {
	      return (int)(Math.random()*100 );
	   }
	   private static int getRandomY() {
	      return (int)(Math.random()*100);
	   }
}
