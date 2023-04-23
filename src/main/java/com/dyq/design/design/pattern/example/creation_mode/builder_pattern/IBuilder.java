package com.dyq.design.design.pattern.example.creation_mode.builder_pattern;

/**
 * Builder接口，用来定义构造对象需要的全部流程，并且有一个返回组装好的对象的方法
 */
public interface IBuilder {
	
	public void buildSex();
	public void buildCloth();
	public void buildWeapon();
	public Person createPerson();
	
}
