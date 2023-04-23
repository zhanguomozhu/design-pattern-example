package com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation.Operation;
import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation.OperationAdd;

/**
 * 加法运算
 */
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
