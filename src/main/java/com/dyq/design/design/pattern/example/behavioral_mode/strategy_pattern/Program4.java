package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern;

import com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2.*;

import java.util.Scanner;

/**
 * 策略模式
 */
public class Program4 {

	public static void main(String[] args) {
		
		//声明一个double变量total来计算总计
		double total = 0.0d;
		String answer;
		do {
			System.out.println("请输入商品单价:");
			String txtPrice = new Scanner(System.in).nextLine();
			System.out.println("请输入商品数量:");
			String txtNum = new Scanner(System.in).nextLine();
			System.out.println("请输入打折条件:0代表正常收费 1代表满300减100 2代表打八折");
			String select = new Scanner(System.in).nextLine();
			
			//利用简单工厂模式根据输入的选项，生成相应的对象
			CashSuper csuper = CashFactory.createCashAccept(select);
			CashContext1 cc = new CashContext1(csuper);
			
			switch (select) {
				case "0":
					cc = new CashContext1(new CashNormal());
					break;
				case "1":
					cc = new CashContext1(new CashReturn("300", "100"));
					break;
				case "2":
					cc = new CashContext1(new CashRebate("0.8"));
					break;
				default:
					break;
			}
			
			double totalPrices = 0d;
			totalPrices = cc.GetResult(Double.parseDouble(txtPrice) * Double.parseDouble(txtNum));
			total = total + totalPrices;
			System.out.println("单价：" + txtPrice + " 数量：" + txtNum + " 合计：" + totalPrices);
			System.out.println("是否继续输入商品? y继续 任意键退出");
			answer = new Scanner(System.in).nextLine();
		} while("y".equals(answer));
		System.out.println(total);
		
	}

}
