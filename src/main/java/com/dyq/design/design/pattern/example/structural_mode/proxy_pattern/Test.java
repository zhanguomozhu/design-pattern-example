package com.dyq.design.design.pattern.example.structural_mode.proxy_pattern;

/**
 * 代理模式
 * 代理模式（Proxy），为其他对象提供一种代理以控制对这个对象的访问。
 * 代理模式主要有3个类：
 *
 * Subject类，定义了RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy。
 * RealSubject类，定义Proxy所代表的真实实体。
 * Proxy类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体。
 * 简单来说，就是定义一个接口，里面提供真实对象的各个方法，真实对象与代理类都实现这个接口，并且在代理类中有个真实对象的引用，用来调用真实对象的相关方法。
 *
 * 举例：
 * 访问数据库，采用代理类进行访问
 * @author Administrator
 */
public class Test {

	public static void main(String[] args) {
		
		ProxyKatrina proxyKatrina = new ProxyKatrina(new MySQLUserKatrina());
		proxyKatrina.add();
		proxyKatrina.del();
		proxyKatrina = new ProxyKatrina(new OracleUserKatrina());
		proxyKatrina.add();
		proxyKatrina.del();
		
	}

}
