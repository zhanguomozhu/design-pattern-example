package com.dyq.design.design.pattern.example.behavioral_mode.iterator_pattern;


/**
 * 倒序抽象迭代器的实现类
 */
public class ConcreteIteratorDesc extends Iterator {

    private ConcreteCollection collection;
    private int current = 0;

    ConcreteIteratorDesc(ConcreteCollection collection) {
        this.collection = collection;
        this.current = collection.size() - 1;
    }

    @Override
    public Object first() {
        return collection.get(collection.size() - 1);
    }

    @Override
	public Object next() {
        Object object = null;
        if (collection != null) {
            current --;
            if (current >= 0) {
                object = collection.get(current);
            }
        }
        return object;
    }

    @Override
    public boolean isDone() {
        return collection != null ? current < 0 ? true : false : true;
    }

    @Override
    public Object currentItem() {
        return collection != null ? collection.get(current) : null;
    }

}
