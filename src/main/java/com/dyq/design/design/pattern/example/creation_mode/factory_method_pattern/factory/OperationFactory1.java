package com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation.*;

/**
 * 运算类工厂
 */
public class OperationFactory1 {

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
