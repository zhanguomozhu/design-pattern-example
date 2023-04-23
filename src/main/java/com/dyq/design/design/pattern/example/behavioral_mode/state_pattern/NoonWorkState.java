package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

/**
 * 中午
 */
public class NoonWorkState extends State {

	@Override
	public void workState(Work work) {
		if (work.getHour() < 13) {
			System.out.println("当前时间：" + work.getHour() + "点， 饿了，午饭；犯困，午休");
		} else {
			work.setState(new AfternoonWorkState());
			work.getWorkState();
		}
	}

}

