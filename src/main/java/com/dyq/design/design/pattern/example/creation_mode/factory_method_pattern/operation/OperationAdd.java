package com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation;

/**
 * 加法运算
 */
public class OperationAdd implements Operation {

	@Override
	public double getResult(double _numberA, double _numberB) {
		return _numberA + _numberB;
	}

}
