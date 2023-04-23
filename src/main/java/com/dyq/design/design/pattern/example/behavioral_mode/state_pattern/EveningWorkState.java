package com.dyq.design.design.pattern.example.behavioral_mode.state_pattern;

/**
 * 晚上
 */
public class EveningWorkState extends State {

	@Override
	public void workState(Work work) {
		if (work.isWorkFinished()) {
            System.out.println("当前时间：" + work.getHour() + "点， 工作已完成，准备回家");
            work.setState(new RestWorkState());
            work.getWorkState();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + "点， 加班哦，疲惫至极");
            } else {
                work.setState(new NightWorkState());
                work.getWorkState();
            }
        }
	}

}
