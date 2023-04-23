package com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.factory;

//运算类工厂
public class OperationFactory2 {

	IFactory oper = null;

	public IFactory createOperate(String operate) {
		
		switch (operate) {
		case "+":
			oper = new AddFactory();
			break;
		case "-":
			oper = new SubFactory();
			break;
		case "*":
			oper = new MulFactory();
			break;
		case "/":
			oper = new DivFactory();
			break;
		default:
			break;
		}

		return oper;
	}

}
