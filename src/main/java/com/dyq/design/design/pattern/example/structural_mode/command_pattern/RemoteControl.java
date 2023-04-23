package com.dyq.design.design.pattern.example.structural_mode.command_pattern;

import com.dyq.design.design.pattern.example.structural_mode.command_pattern.command.Command;

/**
 * 遥控器
 */
public class RemoteControl {
	Command[] onCommands = new Command[7];
	Command[] offCommands = new Command[7];
	public RemoteControl() {}
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute(); 
	}
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute(); 
	}
}
