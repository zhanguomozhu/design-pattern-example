package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add;

//加法
public class IntAdd implements IAdd {

	@Override
	public String getResult(int numberA, int numberB) {
		return String.valueOf((int)numberA + numberB);
	}

}
