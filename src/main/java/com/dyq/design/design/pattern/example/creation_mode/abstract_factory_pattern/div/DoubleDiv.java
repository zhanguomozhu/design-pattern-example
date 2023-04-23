package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div;

public class DoubleDiv implements IDiv {

	@Override
	public String getResult(int numberA, int numberB) {
		return numberB == 0 ? "除数不能为0" : String.valueOf((double)numberA / numberB);
	}
	
}
