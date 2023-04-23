package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type1;


/**
 * 发布
 */
public interface ISubject {
	
	void addObserver(IObserver iObserver);
    void delObserver(IObserver iObserver);
    void bossReturn();
	
}
