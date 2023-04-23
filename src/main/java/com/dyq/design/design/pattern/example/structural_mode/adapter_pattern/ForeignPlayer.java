package com.dyq.design.design.pattern.example.structural_mode.adapter_pattern;

/**
 * 外籍选手类
 */
public class ForeignPlayer {

	private String name;
	
	public ForeignPlayer(String name) {
		this.name = name;
	}
	
	public void attack(){
		System.out.println("外籍选手" + name + "进攻");
	}
	
	public void denfense(){
		System.out.println("外籍选手" + name + "防守");
	}

}
