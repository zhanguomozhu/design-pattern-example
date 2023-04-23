package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type1;

import java.util.Scanner;
//商场收银软件
//营业员根据客户所购买商品的单价和数量进行收费
public class Program1 {

    public static void main(String[] args) {
    	
            //声明一个double变量total来计算总计
            double total = 0.0;
            String answer;
            do {
				System.out.println("请输入商品单价：");
				String txtPrice = new Scanner(System.in).nextLine();
				System.out.println("请输入商品数量：");
				String txtNum = new Scanner(System.in).nextLine();
				//声明一个double变量totalPrices来计算每个商品的单价（txtPrice）*数量(txtNum)后的合计
	            double totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum);
	            //将每个商品合计计入总计
	            total = total + totalPrices;
	            System.out.println("单价：" + txtPrice + " 数量：" + txtNum + " 合计：" + totalPrices);
	            System.out.println("是否继续输入商品? y继续 任意键退出");
	            answer = new Scanner(System.in).nextLine();
			} while ("y".equals(answer));
            
            System.out.println(total);
            
    }

}
