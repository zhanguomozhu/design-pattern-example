package com.dyq.design.design.pattern.example.behavioral_mode.iterator_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

/**
 * 迭代器模式
 * 当你需要访问一个聚集对象，而且不管这些对象是什么都需要遍历的时候，你就应该考虑用迭代器模式。当你需要对聚集有多种方式遍历时，也可以考虑使用迭代器模式。
 *
 * 简单来说，迭代器一般都是和集合同时出现的，只要定义了一个集合，一般都需要提供一个迭代器用来遍历集合内的元素。
 */
public class Test2 {
	
    public static void main(String[] args) {
        List<Object> collection = new ArrayList<>();
        collection.add("no1");
        collection.add("no2");
        collection.add("no3");
        collection.add("no4");
        collection.add("no5");
        
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = (Object) iterator.next();
            System.out.println(object);
        }
        System.out.println("====== 准备倒叙 ======");
        Collections.reverse(collection);
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = (Object) iterator.next();
            System.out.println(object);
        }
    }
    
}
