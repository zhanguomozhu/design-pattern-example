package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2;

import java.util.Observable;
import java.util.Observer;

/**
 * 看股票的同事
 */
public class StockObserver implements Observer {
	
	private String name;
	
	public StockObserver(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name + "收到消息：" + arg + "。 停止炒股，开始工作。");
	}
	
}
