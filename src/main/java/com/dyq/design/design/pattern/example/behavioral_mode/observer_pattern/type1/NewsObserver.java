package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type1;

/**
 * 看新闻的同事
 */
public class NewsObserver implements IObserver {

	private String name;
    public NewsObserver(String name) {
       this.name = name;
    }
    
    @Override
    public void goToWork() {
        System.out.println(name + "停止看新闻，开始工作。");
    }

}
