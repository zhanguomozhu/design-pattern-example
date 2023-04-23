package com.dyq.design.design.pattern.example.structural_mode.command_pattern;

import com.dyq.design.design.pattern.example.structural_mode.command_pattern.command.LightOffCommand;
import com.dyq.design.design.pattern.example.structural_mode.command_pattern.command.LightOnCommand;


/**
 * 命令模式
 * 某灯具厂商欲生产一个灯具遥控器，该遥控器具有 7 个可编程的插槽，每个插槽都有开关按钮，对应着一个不同的灯。
 * 利用该遥控器能够统一控制房间中该厂商所有品牌灯具的开关，现采用 Command（命令）模式实现该遥控器的软件部分
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println("=======================================");
		Light kitchenLight = new Light("kitchen");
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
	}
}
