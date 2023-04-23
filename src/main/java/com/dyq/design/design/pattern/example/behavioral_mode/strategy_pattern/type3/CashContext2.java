package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type3;

import com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2.CashNormal;
import com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2.CashRebate;
import com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2.CashReturn;
import com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2.CashSuper;

/**
 * 收费策略Context
 */
public class CashContext2 {

	/**
	 * 声明一个现金收费父类对象
	 */
	CashSuper cs = null;

	/**
	 * 注意参数不是具体的收费策略对象，而是一个字符串，表示收费类型
	 * 将实例化具体策略的过程由客户端转移到Context中。简单工厂的应用
	 * @param type
	 */
	public CashContext2(String type) {
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
	}
	
	public double GetResult(double money) {
		return cs.acceptCash(money);
	}

}
