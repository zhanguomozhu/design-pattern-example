package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper {

	private double moneyRebate = 1;

	/**
	 * 初始化时，必需要输入折扣率,如八折，就是0.8
	 * @param moneyRebate
	 */
	public CashRebate(String moneyRebate) {
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
