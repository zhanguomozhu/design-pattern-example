package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern;

import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IDiv;

/**
 * 抽象工厂3
 * 抽象工厂模式（Abstract Factory），提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *
 * 举例：
 * 为了方便和之前的工程模式作比较，还是采用简单计算器的例子，不过在实现运算功能的时候，由于数字的类型不同，
 * 比如int、float、double等，可能会产生不同的结果，所以需要扩展出多个类型的运算类。下面用抽象工厂模式实现加法、除法运算。
 */
public class Test3 {
	
    public static void main(String[] args) {
        IAdd add = ReflectFactory.createAdd();
        IDiv div = ReflectFactory.createDiv();
        if (add != null && div != null) {
            System.out.println("float工厂：7+3 = " + add.getResult(7, 3));
            System.out.println("float工厂：7/3 = " + div.getResult(7, 3));
        }
    }
    
}
