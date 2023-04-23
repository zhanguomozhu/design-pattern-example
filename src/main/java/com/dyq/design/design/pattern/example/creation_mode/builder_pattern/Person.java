package com.dyq.design.design.pattern.example.creation_mode.builder_pattern;

/**
 * 角色类
 */
public class Person {
	
	private String sex;
	private String cloth;
	private String weapon;
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getCloth() {
		return cloth;
	}
	
	public void setCloth(String cloth) {
		this.cloth = cloth;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public String show(){
		return "角色性别：" + sex + " 角色服饰：" + cloth + " 角色武器：" + weapon;
	}
	
}
