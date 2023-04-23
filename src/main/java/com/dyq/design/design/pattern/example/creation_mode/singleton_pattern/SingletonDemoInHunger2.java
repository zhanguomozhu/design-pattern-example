package com.dyq.design.design.pattern.example.creation_mode.singleton_pattern;


/**
 * 饿汉式 （静态代码块）【可用】
 *  1. 类加载时就初始化，浪费内存，不能延迟加载；
 *  2. 基于 classloader 机制避免了多线程的同步问题，线程安全；
 *  3. 没有加锁，调用效率高。
 */
public class SingletonDemoInHunger2 {

    /**
     * 私有实例，类初始化就加载
     */
    private static SingletonDemoInHunger2 instance;

    static {
        instance = new SingletonDemoInHunger2();
    }

    /**
     * 私有构造方法
     */
    private SingletonDemoInHunger2() {}

    /**
     * 公共的、静态的获取实例方法
     * @return
     */
    public static SingletonDemoInHunger2 getInstance() {
        return instance;
    }
}