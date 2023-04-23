package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type1;

import java.util.Scanner;
//增加打折
public class Program2 {

	public static void main(String[] args) {

		//声明一个double变量total来计算总计
		double total = 0.0d;
		String answer;
		do {
			System.out.println("请输入商品单价:");
			String txtPrice = new Scanner(System.in).nextLine();
			System.out.println("请输入商品数量:");
			String txtNum = new Scanner(System.in).nextLine();
			System.out.println("请输入打折条件:0代表正常收费 1代表打八折 2代表打七折 3代表打五折");
			String select = new Scanner(System.in).nextLine();
			double totalPrices = 0d;
			switch (select) {
			case "0":
				totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum);
				break;
			case "1":
				totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum) * 0.8;
				break;
			case "2":
				totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum) * 0.7;
				break;
			case "3":
				totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum) * 0.5;
				break;
			}
			total = total + totalPrices;
			System.out.println("单价：" + txtPrice + " 数量：" + txtNum + " 合计：" + totalPrices);
			System.out.println("是否继续输入商品? y继续 任意键退出");
			answer = new Scanner(System.in).nextLine();
		} while("y".equals(answer));
		System.out.println(total);

	}

}
