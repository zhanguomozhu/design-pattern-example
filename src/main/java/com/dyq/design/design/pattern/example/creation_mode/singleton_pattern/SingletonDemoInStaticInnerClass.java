package com.dyq.design.design.pattern.example.creation_mode.singleton_pattern;


/**
 *  静态内部类 【推荐使用】
 *  1. 利用了classloader机制来保证初始化 instance 时只有一个线程，线程安全；
 *  2. 只有通过显式调用 getInstance 方法时，才会显式装载静态内部类，从而实例化instance，延迟加载。
 */
public class SingletonDemoInStaticInnerClass {

    /**
     * 静态内部类
     */
    private static class InnerClass{
        // 初始化实例
        private final static SingletonDemoInStaticInnerClass INSTANCE = new SingletonDemoInStaticInnerClass();
    }

    /**
     * 私有构造
     */
    private SingletonDemoInStaticInnerClass() {}

    /**
     * 公关获取实例方法（线程安全，延迟加载）
     * @return
     */
    public static SingletonDemoInStaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }
}