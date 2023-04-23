package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.DoubleAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.DoubleDiv;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IDiv;

/**
 * double 工厂类
 */
public class DoubleFactory implements IFactory {

	@Override
	public IAdd createAdd() {
		return new DoubleAdd();
	}

	@Override
	public IDiv createDiv() {
		return new DoubleDiv();
	}

}
