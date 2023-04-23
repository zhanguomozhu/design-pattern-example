package com.dyq.design.design.pattern.example.structural_mode.decorator_pattern;

/**
 * 装饰模式
 */
public class Test1 {
	public static void main(String[] args) {
		
		Behaviour behaviour = new XiaoMing();
		behaviour = new NoonDecorator(behaviour);
		behaviour = new NightDecorator(behaviour);
		behaviour.process();
		
	}
}
