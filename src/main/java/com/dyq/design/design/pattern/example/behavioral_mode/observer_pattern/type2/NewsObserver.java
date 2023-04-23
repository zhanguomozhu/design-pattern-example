package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2;

import java.util.Observable;
import java.util.Observer;

/**
 * 看新闻的同事
 */
public class NewsObserver implements Observer {
	
	private String name;
	
	public NewsObserver(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + "收到消息：" + arg + "。 停止看新闻，开始工作。");
	}
	
}
