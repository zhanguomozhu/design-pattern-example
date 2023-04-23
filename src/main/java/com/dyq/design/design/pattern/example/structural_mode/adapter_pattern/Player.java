package com.dyq.design.design.pattern.example.structural_mode.adapter_pattern;


/**
 * 适配器接口
 */
public abstract class Player {

	String name;
	public Player(String name) {
		this.name = name;
	}
	public abstract void attack();
	public abstract void defense();

}
