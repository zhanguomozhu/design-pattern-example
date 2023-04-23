package com.dyq.design.design.pattern.example.creation_mode.singleton_pattern;


/**
 * 懒汉式 （线程不安全）【不可用】
 * 线程不安全的，但是可以做到延迟加载
 */
public class SingletonDemoInLazy1 {

    /**
     * 私有实例,初始化的时候不加载（延迟加载）
     */
    private static SingletonDemoInLazy1 instance;

    /**
     * 私有构造
     */
    private SingletonDemoInLazy1() {}

    /**
     * 公共获取实例方法（线程不安全）
     * @return
     */
    public static SingletonDemoInLazy1 getInstance() {
        // 使用的时候加载
        if(instance == null ) {
            instance = new SingletonDemoInLazy1();
        }
        return instance;
    }
}