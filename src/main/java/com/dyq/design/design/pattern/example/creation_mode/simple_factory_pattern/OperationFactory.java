package com.dyq.design.design.pattern.example.creation_mode.simple_factory_pattern;

import com.dyq.design.design.pattern.example.creation_mode.simple_factory_pattern.operation.*;

/**
 * 运算类工厂
 */
public class OperationFactory {

	Operation oper = null;

	public Operation createOperate(String operate) {
		
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		default:
			break;
		}

		return oper;
	}

}
