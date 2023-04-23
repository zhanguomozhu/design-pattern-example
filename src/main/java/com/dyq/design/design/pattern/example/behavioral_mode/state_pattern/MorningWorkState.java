package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

/**
 * 早上
 */
public class MorningWorkState extends State {

	@Override
	public void workState(Work work) {
		if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点， 上午工作，精神百倍");
        } else {
            work.setState(new NoonWorkState());
            work.getWorkState();
        }
	}

}
