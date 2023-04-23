package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2;

//现金收费工厂类
public class CashFactory {

	//根据条件返回相应的对象
	public static CashSuper createCashAccept(String type) {
		
		CashSuper cs = null;
		switch (type) {
		case "0":
			cs = new CashNormal();
			break;
		case "1":
			CashReturn cr1 = new CashReturn("300", "100");
			cs = cr1;
			break;
		case "2":
			CashRebate cr2 = new CashRebate("0.8");
			cs = cr2;
			break;
		}
		
		return cs;
		
	}

}
