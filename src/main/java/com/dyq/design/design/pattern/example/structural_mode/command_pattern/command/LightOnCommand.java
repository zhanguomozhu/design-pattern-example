package com.dyq.design.design.pattern.example.structural_mode.command_pattern.command;

import com.dyq.design.design.pattern.example.structural_mode.command_pattern.Light;


/**
 * 开灯命令
 */
public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.on();
	}
}
