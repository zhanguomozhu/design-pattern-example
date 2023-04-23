package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2;

import java.util.Observable;
import java.util.Observer;

/**
 * 看体育赛事的同事
 */
public class SportsObserver implements Observer {
	
	private String name;
	
	public SportsObserver(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + "收到消息：" + arg + "。 停止看体育赛事，开始工作。");
	}
	
}
