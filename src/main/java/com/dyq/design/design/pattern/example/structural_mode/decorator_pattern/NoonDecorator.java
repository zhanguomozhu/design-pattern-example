package com.dyq.design.design.pattern.example.structural_mode.decorator_pattern;

/**
 * ConcreteDecorator类对应的类-NoonDecorator、NightDecorator类
 * 中午
 */
public class NoonDecorator extends Decorator {
	
	public NoonDecorator(Behaviour behaviour ) {
		super(behaviour);
	}

	/**
	 * 午休
	 */
	public void relex() {
		System.out.println("中午有点困，午休一下");
	}

	/**
	 * 干完工作后再午休，因此添加在doSth方法后
	 */
	@Override
	public void doSth() {
		super.doSth();
		relex();
	}
}
