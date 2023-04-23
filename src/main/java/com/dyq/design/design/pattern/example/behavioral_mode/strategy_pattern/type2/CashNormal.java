package com.dyq.design.design.pattern.example.behavioral_mode.strategy_pattern.type2;

/**
 * 正常收费子类
 */
public class CashNormal extends CashSuper {

	/**
	 * 正常收费，原价返回
	 * @param money
	 * @return
	 */
	@Override
	public double acceptCash(double money) {
		return money;
	}

}
