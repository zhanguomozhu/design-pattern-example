package com.dyq.design.design.pattern.example.behavioral_mode.iterator_pattern;


/**
 * 抽象集合类
 */
public abstract class Collection {
	
    public abstract Iterator createIterator();
    public abstract void add(Object object);
    public abstract int size();
    public abstract Object get(int index);
    
}
