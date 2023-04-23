package com.dyq.design.design.pattern.example.creation_mode.builder_pattern;

/**
 * 构建男性角色的类
 */
public class BuildMan implements IBuilder {

	Person person;

	public BuildMan() {
		this.person = new Person();
	}

	@Override
	public void buildSex() {
		person.setSex("男");
		System.out.println("已选择男性角色进行创建");
	}

	@Override
	public void buildCloth() {
		person.setCloth("男性服饰");
		System.out.println("创建男性角色服装");
	}

	@Override
	public void buildWeapon() {
		person.setWeapon("男性武器");
		System.out.println("创建男性角色武器");
	}

	@Override
	public Person createPerson() {
		return this.person;
	}

}
