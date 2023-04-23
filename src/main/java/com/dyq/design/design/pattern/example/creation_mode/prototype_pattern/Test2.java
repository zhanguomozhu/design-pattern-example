package com.dyq.design.design.pattern.example.creation_mode.prototype_pattern;

/**
 * 原型模式2
 * 原型模式（Prototype），用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * Java当中，提供了Cloneable接口，实现了这个接口表示这个类支持被复制。如果一个类没有实现这个接口但是调用了clone()方法，Java编译器将抛出一个CloneNotSupportedException异常。
 *
 * 举例：
 * 有一份简历，需要被复制成多份，发给不同的人，并且需要对简历的部分内容进行调整。
 */
public class Test2 {

    public static void main(String[] args) {
        Resume2 a = new Resume2("大鸟");
        a.setPersonalInfo("男", 24);
        a.setWorkExperience("1998-2000", "XX公司");
        
        Resume2 b = (Resume2) a.clone();
        b.setWorkExperience("2000-2006", "YY公司");
        
        Resume2 c = (Resume2) a.clone();
        c.setPersonalInfo("男", 29);
        c.setWorkExperience("2006-2010", "ZZ公司");
        
        a.show();
        b.show();
        c.show();
    }
    
}
