package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type2;

import java.util.Observable;
public class NotifySubject extends Observable {
	
    String message;    
    
    public NotifySubject() {
        message = "你们玩吧，我帮你们观察boss";
        System.out.println("NotifySubject: " + message);
    }
    
    public void bossReturn(){
        message = "boss回公司了，大家赶紧开始工作";
        System.out.println("NotifySubject: " + message);
        setChanged();
        this.notifyObservers(message);
    }
    
}
