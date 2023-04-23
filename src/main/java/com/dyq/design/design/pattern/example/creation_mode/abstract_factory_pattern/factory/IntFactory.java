package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IDiv;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IntAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IntDiv;

/**
 * int 工厂类
 */
public class IntFactory implements IFactory {

	@Override
	public IAdd createAdd() {
		return new IntAdd();
	}

	@Override
	public IDiv createDiv() {
		return new IntDiv();
	}
	
}
