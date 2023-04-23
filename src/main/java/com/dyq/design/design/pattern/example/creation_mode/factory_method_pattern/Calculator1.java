package com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern;

import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.factory.OperationFactory1;
import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation.Operation;

import java.util.Scanner;

/**
 * 简单工厂模式实现计算器
 * 工厂方法模式（Factory Method），定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 */
public class Calculator1 {

	public static void main(String[] args) {
		double numberA = 0d;
		double numberB = 0d;
		String operate = "";
		double result = 0d;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Java简单工厂模式计算器：");
			System.out.println("请输入数字A：");
			numberA = sc.nextDouble();
			
			System.out.println("请选择运算符号（+、-、*、/）：");
			operate = sc.next();
			
			System.out.println("请输入数字B：");
			numberB = sc.nextDouble();
			
			Operation operation = new OperationFactory1().createOperate(operate);
			if (operation == null) {
				System.out.println("请在“+、-、*、/”选择正确的运算符");
			} else {
				result = operation.getResult(numberA, numberB);
				System.out.println(String.format("您的计算结果是：%s %s %s = %s", numberA, operate, numberB, result));
			}
			
			sc.close();
		} catch (Exception e) {
			System.out.println(String.format("您的输入有误：%s", e.getMessage()));
		}

	}

}
