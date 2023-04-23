package com.dyq.design.design.pattern.example.behavioral_mode.iterator_pattern;


/**
 * 抽象迭代器的实现类
 */
public class ConcreteIterator extends Iterator {

    private ConcreteCollection collection;
    private int current = 0;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection;
    }

    @Override
	public Object first() {
        return collection != null ? collection.get(0) : null;
    }

    @Override
    public Object next() {
        Object object = null;
        if (collection != null) {
            current++;
            if (current < collection.size()) {
                object = collection.get(current);
            }
        }
        return object;
    }

    @Override
    public boolean isDone() {
        return collection != null ? current < collection.size() ? false : true : true;
    }

    @Override
    public Object currentItem() {
        return collection != null ? collection.get(current) : null;
    }

}
