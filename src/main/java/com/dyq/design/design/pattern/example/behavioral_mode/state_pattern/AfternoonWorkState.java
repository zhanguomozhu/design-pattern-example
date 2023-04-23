package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

/**
 * 下午
 */
public class AfternoonWorkState extends State {

	@Override
	public void workState(Work work) {
		if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点， 下午状态还不错，继续努力");
        } else {
            work.setState(new EveningWorkState());
            work.getWorkState();
        }
	}

}
