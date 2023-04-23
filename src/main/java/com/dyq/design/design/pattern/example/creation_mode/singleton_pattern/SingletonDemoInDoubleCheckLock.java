package com.dyq.design.design.pattern.example.creation_mode.singleton_pattern;


/**
 * 双重检查锁 【推荐使用】
 *  1. 双重判断，延迟加载；
 *  2. 线程安全；
 *  3. JDK 版本要求1.5起。
 */
public class SingletonDemoInDoubleCheckLock {

    /**
     * 私有实例，volatile关键字，禁止指令重排。
     */
    private volatile static SingletonDemoInDoubleCheckLock instance;

    /**
     * 私有构造
     */
    private SingletonDemoInDoubleCheckLock() {}

    /**
     * 公共获取实例方法（线程安全）
     * @return
     */
    public static SingletonDemoInDoubleCheckLock getInstance() {
        // 一重检查
        if(instance == null ) {
            synchronized (SingletonDemoInDoubleCheckLock.class) {
                // 二重检查
                if(instance == null) {
                    instance = new SingletonDemoInDoubleCheckLock();
                }
            }
        }
        return instance;
    }
}