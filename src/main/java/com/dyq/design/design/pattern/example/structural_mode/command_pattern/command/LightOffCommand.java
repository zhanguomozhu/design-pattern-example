package com.dyq.design.design.pattern.example.structural_mode.command_pattern.command;

import com.dyq.design.design.pattern.example.structural_mode.command_pattern.Light;


/**
 * 关灯命令
 */
public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}
}
