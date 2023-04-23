package com.dyq.design.design.pattern.example.creation_mode.builder_pattern;

/**
 * 构建女性角色的类
 */
public class BuildWomen implements IBuilder {

	Person person;

	public BuildWomen() {
		this.person = new Person();
	}

	@Override
	public void buildSex() {
		person.setSex("女");
		System.out.println("已选择女性角色进行创建");
	}

	@Override
	public void buildCloth() {
		person.setCloth("女性服装");
		System.out.println("创建女性角色服装");
	}

	@Override
	public void buildWeapon() {
		person.setWeapon("女性武器");
		System.out.println("创建女性角色武器");
	}

	@Override
	public Person createPerson() {
		return this.person;
	}

}
