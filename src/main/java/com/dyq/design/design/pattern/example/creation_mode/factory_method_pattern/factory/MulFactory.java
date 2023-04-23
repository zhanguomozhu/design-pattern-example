package com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation.Operation;
import com.dyq.design.design.pattern.example.creation_mode.factory_method_pattern.operation.OperationMul;

/**
 * 乘法运算
 */
public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
