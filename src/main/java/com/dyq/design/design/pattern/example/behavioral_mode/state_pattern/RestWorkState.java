package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

/**
 * 工作完，休息
 */
public class RestWorkState extends State {

	@Override
	public void workState(Work work) {
		System.out.println("当前时间：" + work.getHour() + "点， 准备休息了");
	}

}
