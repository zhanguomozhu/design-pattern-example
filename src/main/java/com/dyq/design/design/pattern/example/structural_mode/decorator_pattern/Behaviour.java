package com.dyq.design.design.pattern.example.structural_mode.decorator_pattern;

/**
 * Component对应的类-Behaviour类
 */
public interface Behaviour {

	/**
	 * 起床
	 */
	public void wakeUp();

	/**
	 * 上班
	 */
	public void doSth();

	/**
	 * 睡觉
	 */
	public void sleep();

	/**
	 * 执行过程
	 */
	public void process();
	
}
