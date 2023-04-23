package com.dyq.design.design.pattern.example.creation_mode.simple_factory_pattern.operation;

/**
 * 除法运算
 */
public class OperationDiv implements Operation {

	@Override
	public double getResult(double _numberA, double _numberB) {
		if (_numberB == 0) {
			throw new RuntimeException("除数B不能为0.");
		}
		return _numberA / _numberB;
	}

}
