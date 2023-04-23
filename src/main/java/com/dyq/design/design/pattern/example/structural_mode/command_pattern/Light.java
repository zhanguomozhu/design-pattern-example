package com.dyq.design.design.pattern.example.structural_mode.command_pattern;


/**
 * 灯
 */
public class Light {
	String name;
	public Light() {}
	public Light(String name) { 
		this.name=name;
	}
	public void on() { // 开灯
		System.out.println(name+":开灯"); 
	} 
	public void off(){ // 关灯
		System.out.println(name+":关灯");
	} 
}
