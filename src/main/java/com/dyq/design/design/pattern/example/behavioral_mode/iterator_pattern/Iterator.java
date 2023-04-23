package com.dyq.design.design.pattern.example.behavioral_mode.iterator_pattern;

/**
 * 抽象迭代器类
 */
public abstract class Iterator {
	
    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
    
}
