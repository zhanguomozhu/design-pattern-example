package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2;

/**
 * 收费策略Context
 * @author Administrator
 */
public class CashContext1 {

	/**
	 * 声明一个现金收费父类对象
	 */
	private CashSuper cs;

	/**
	 * 设置策略行为，参数为具体的现金收费子类（正常，打折或返利）
	 * @param csuper
	 */
	public CashContext1(CashSuper csuper) {
		this.cs = csuper;
	}

	/**
	 * 得到现金促销计算结果（利用了多态机制，不同的策略行为导致不同的结果）
	 * @param money
	 * @return
	 */
	public double GetResult(double money) {
		return cs.acceptCash(money);
	}

}
