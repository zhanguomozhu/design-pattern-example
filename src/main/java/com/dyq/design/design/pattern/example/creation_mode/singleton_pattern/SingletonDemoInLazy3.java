package com.dyq.design.design.pattern.example.creation_mode.singleton_pattern;


/**
 * 懒汉式 （线程安全，同步代码块）【不可用】
 * 关键字synchronized锁定类对象，可以确保线程安全，能做到延迟加载，但是效率不高。
 */
public class SingletonDemoInLazy3 {

    /**
     * 私有实例,初始化的时候不加载（延迟加载）
     */
    private static SingletonDemoInLazy3 instance;

    /**
     * 私有构造
     */
    private SingletonDemoInLazy3() {}

    /**
     * 公共获取实例方法（线程安全，调用效率低）
     * @return
     */
    public static SingletonDemoInLazy3 getInstance() {
        if(instance == null ) {
            synchronized (SingletonDemoInLazy3.class) {
                instance = new SingletonDemoInLazy3();
            }
        }
        return instance;
    }
}