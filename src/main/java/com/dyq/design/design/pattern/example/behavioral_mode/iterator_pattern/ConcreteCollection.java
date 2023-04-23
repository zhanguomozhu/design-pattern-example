package com.dyq.design.design.pattern.example.behavioral_mode.iterator_pattern;

import java.util.ArrayList;

/**
 * 抽象集合类的实现类
 */
public class ConcreteCollection extends Collection {
	
    private ArrayList<Object> items = new ArrayList<>();
    
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
    @Override
    public int size() {
        return items.size();
    }
    
    @Override
    public Object get(int index) {
        return items.get(index);
    }
    
    @Override
    public void add(Object object) {
        items.add(object);
    }
    
}
