package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

/**
 * 夜晚
 */
public class NightWorkState extends State {

	@Override
	public void workState(Work work) {
		System.out.println("当前时间：" + work.getHour() + "点，不行了，睡着了");
	}

}
