package com.dyq.design.design.pattern.example.structural_mode.decorator_pattern;

/**
 * 装饰模式
 * 装饰模式（Decorator），动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 *
 * 装饰模式的基础有4个类：
 *
 * Componet类：定义了一个对象接口，可以给这些对象动态地添加职责。
 * ConcreteComponent类：定义了一个具体的对象，也可以给这个对象添加一些职责。
 * Decorator类：装饰抽象类，继承了Component类，从外类来扩展Component类的功能，但对于- Component类来说，是无需知道Decorator的存在的。
 * ConcreteDecorator类：具体的装饰对象，起到给Component添加职责的功能。实际上会有多个装饰对象。
 * @author Administrator
 */
public class Test2 {
	public static void main(String[] args) {
		Behaviour behaviour = new XiaoMing();
//		behaviour = new NoonDecorator(behaviour);
//		behaviour  = new NightDecorator(behaviour);
//		behaviour.process();
		NoonDecorator d1 = new NoonDecorator(behaviour);
		NightDecorator d2 = new NightDecorator(d1);
		d2.process();
	}
}
