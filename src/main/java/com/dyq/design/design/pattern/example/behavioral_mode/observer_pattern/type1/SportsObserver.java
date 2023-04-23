package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type1;

/**
 * 看体育赛事的同事
 */
public class SportsObserver implements IObserver {

	private String name;
	
	public SportsObserver(String name) {
		this.name = name;
	}
	
	@Override
	public void goToWork() {
		System.out.println(name + "停止看体育赛事，开始工作。");
	}

}
