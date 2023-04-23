package com.dyq.design.design.pattern.example.creation_mode.singleton_pattern;


/**
 * 枚举类 【推荐使用】
 * 枚举：这是实现单例模式的最佳方法。它更简洁，不仅能避免多线程同步问题，
 * 而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。但是不是延迟加载的。
 */
public enum SingletonEnum {

    /**
     * 枚举元素本身就是单例
      */
    INSTANCE;


    /**
     * 其他要执行的方法
     */
    public void sayHello() {
        System.out.println("你好");
    }

}