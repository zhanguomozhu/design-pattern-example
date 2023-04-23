package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.FloatAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.FloatDiv;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IDiv;

/**
 * float 工厂类
 */
public class FloatFactory implements IFactory {

	@Override
	public IAdd createAdd() {
		return new FloatAdd();
	}

	@Override
	public IDiv createDiv() {
		return new FloatDiv();
	}
	
}
