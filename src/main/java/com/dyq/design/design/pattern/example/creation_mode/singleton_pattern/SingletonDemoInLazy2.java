package com.dyq.design.design.pattern.example.creation_mode.singleton_pattern;


/**
 * 懒汉式 （线程安全，同步方法）【不推荐用】
 * 关键字synchronized声明公共的获取实例的方法getInstance()，可以确保线程安全，能做到延迟加载，但是效率不高。
 */
public class SingletonDemoInLazy2 {

    /**
     * 私有实例,初始化的时候不加载（延迟加载）
     */
    private static SingletonDemoInLazy2 instance;

    /**
     * 私有构造
     */
    private SingletonDemoInLazy2() {}

    /**
     * 公共获取实例方法（线程安全，调用效率低）
     * @return
     */
    public synchronized static SingletonDemoInLazy2 getInstance() {
        if(instance == null ) {
            instance = new SingletonDemoInLazy2();
        }
        return instance;
    }
}