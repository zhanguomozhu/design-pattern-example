package com.dyq.design.design.pattern.example.behavioral_mode.template_pattern;

/**
 * 体育运动模板类
 */
public abstract class Sports {

	public void start(){
		System.out.println("比赛开始，开始计时。");
	}

	public void end(){
		System.out.println("时间到，比赛结束。");
	}

	public abstract void process();

	/**
	 * 使用final修饰，防止修改模板
	 */
	public final void play(){
		start();
		process();
		end();
	}
	
}
