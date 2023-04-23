package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type1;

import java.util.ArrayList;
import java.util.List;

/**
 * boss通知
 */
public class NotifySubject implements ISubject {

    List<IObserver> observers;
    
    @Override
    public void addObserver(IObserver iObserver) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(iObserver);
    }

    @Override
    public void delObserver(IObserver iObserver) {
        if (observers == null || observers.isEmpty()) {
            return;
        }
        observers.remove(iObserver);
    }

    /**
     *  通知每一个加入过的观察者，去执行主题变更时的方法
     */
    public void notifyObserver() {
        for (IObserver iObserver : observers) {
            iObserver.goToWork();
        }
    }

    @Override
    public void bossReturn() {
        System.out.println("boss回公司了，大家赶紧开始工作");
        notifyObserver();
    }
    
}
