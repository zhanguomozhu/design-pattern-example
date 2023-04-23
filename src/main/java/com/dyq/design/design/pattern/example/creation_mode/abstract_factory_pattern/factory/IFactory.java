package com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.factory;

import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.add.IAdd;
import com.dyq.design.design.pattern.example.creation_mode.abstract_factory_pattern.div.IDiv;

public interface IFactory {
	
	IAdd createAdd();
	IDiv createDiv();
	
}
