package com.dyq.design.design.pattern.example.structural_mode.bridge_pattern;


import com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.brand.Vivo;
import com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.brand.XiaoMi;
import com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.phone.FoldedPhone;
import com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.phone.Phone;

/**
 * 桥接模式
 * 桥接模式 （Bridge），在软件系统中，某些类型由于自身的逻辑，它具有两个或多个维度的变化，那么如何应对这种“多维度的变化”？这就要使用桥接模式
 * 将抽象部分和它的实现部分分离，使它们都可以独立的变化。
 */
public class Test {

	public static void main(String[] args){
		Phone phone=new FoldedPhone(new Vivo());
		phone.open();
		phone.call();
		phone.close();

		System.out.println("===========================");
		Phone phone1=new FoldedPhone(new XiaoMi());
		phone1.open();
		phone1.call();
		phone1.close();
	}


}
