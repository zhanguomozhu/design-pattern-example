package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern;

import com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2.NewsObserver;
import com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2.NotifySubject;
import com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2.SportsObserver;
import com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2.StockObserver;

import java.util.Observer;

/**
 * 观察者模式2
 * 观察者模式，又叫做发布-订阅（Publish/Subscribe）模式，定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
 * 这个主题对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己。
 *
 * 举例：
 * 在工作的时候，如果老板不在，有的人可能会放松一下，看看新闻或者看看股票。这个时候需要有个人时刻观察老版的动向，
 * 如果老板回来了，就通知大家一声，让大家赶紧开始工作。
 */
public class Test2 {
	
    public static void main(String[] args) {
    	
        Observer xiaoMing = new NewsObserver("小明");
        Observer xiaoWang = new SportsObserver("小王");
        Observer xiaoLi = new StockObserver("小李");
        
        NotifySubject boss = new NotifySubject();
        boss.addObserver(xiaoLi);
        boss.addObserver(xiaoWang);
        boss.addObserver(xiaoMing);
        boss.bossReturn();
        
        System.out.println("=== 这次忘记通知小王了 ===");
        
        boss.deleteObserver(xiaoWang);;
        boss.bossReturn();
        
        System.out.println("=== 小王被老板逮到了 ===");
        
    }
    
}
