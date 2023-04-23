package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add;

public class FloatAdd implements IAdd {
	
	@Override
	public String getResult(int numberA, int numberB) {
		return String.valueOf((float)numberA + numberB);
	}
	
}
