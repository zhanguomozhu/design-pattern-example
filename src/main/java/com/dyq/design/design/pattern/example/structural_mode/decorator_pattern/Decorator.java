package com.dyq.design.design.pattern.example.structural_mode.decorator_pattern;

/**
 * Decorator类对应的类-Decorator类
 */
public abstract class Decorator implements Behaviour {

	private Behaviour behaviour;
	
	public Decorator(Behaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	@Override
	public void wakeUp() {
		if (behaviour!= null) {
			behaviour.wakeUp();
		}
	}
	
	@Override
	public void doSth() {
		if (behaviour != null) {
			behaviour.doSth();;
		}
	}
	
	@Override
	public void sleep() {
		if (behaviour!= null) {
			behaviour.sleep();
		}
	}
	
	@Override
	public void process() {
		if (behaviour!= null) {
		    // 注意，一定不要写成behaviour.wakeUp();
		    // 否则无法调用具体的装饰对象中，重写的父类中的方法
			wakeUp();
			doSth();
			sleep();
		}
	}
	
}
