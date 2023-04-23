package com.dyq.design.design.pattern.example.structural_mode.decorator_pattern;

/**
 * ConcreteDecorator类对应的类-NoonDecorator、NightDecorator类
 * 晚上
 */
public class NightDecorator extends Decorator {
	
	public NightDecorator(Behaviour behaviour ) {
		super(behaviour );
	}

	/**
	 * 吃饭
	 */
	public void eat() {
		System.out.println("工作一天辛苦了，吃顿大餐");
	}

	/**
	 *  睡觉前来顿大餐，因此添加在sleep方法前
	 */
	@Override
	public void sleep() {
		eat();
		super.sleep();
	}
	
}
