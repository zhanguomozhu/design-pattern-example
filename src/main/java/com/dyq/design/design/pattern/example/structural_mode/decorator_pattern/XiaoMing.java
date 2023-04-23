package com.dyq.design.design.pattern.example.structural_mode.decorator_pattern;

/**
 * ConcreteComponent对应的类-XiaoMing类
 */
public class XiaoMing implements Behaviour {

	@Override
	public void wakeUp() {
		System.out.println("早上8点起床");
	}

	@Override
	public void doSth() {
		System.out.println("去上班");
	}

	@Override
	public void sleep() {
		System.out.println("晚上10点睡觉");
	}

	@Override
	public void process() {
		wakeUp();
		doSth();
		sleep();
	}

}
