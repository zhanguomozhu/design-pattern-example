package com.dyq.design.design.pattern.example.structural_mode.adapter_pattern;

/**
 * 翻译员：转换其他类为play类
 */
public class Translator extends Player {

	private ForeignPlayer foreignPlayer;

	public Translator(String name) {
		super(name);
		foreignPlayer = new ForeignPlayer(name);
	}

	@Override
	public void attack() {
		foreignPlayer.attack();
	}

	@Override
	public void defense() {
		foreignPlayer.denfense();
	}

}
