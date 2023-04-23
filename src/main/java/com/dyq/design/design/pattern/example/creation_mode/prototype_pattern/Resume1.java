package com.dyq.design.design.pattern.example.creation_mode.prototype_pattern;

/**
 * 简历类1
 */
public class Resume1 implements Cloneable {
	
	private String name;
	private String sex;
	private int age;
	private String timeArea;
	private String company;

	public Resume1(String name) {
		this.name = name;
	}

	/**
	 * 设置个人信息
	 * @param sex
	 * @param age
	 */
	public void setPersonalInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 设置工作经历
	 * @param timeArea
	 * @param company
	 */
	public void setWorkExperience(String timeArea,String  company){
		this.timeArea = timeArea;
		this.company= company;
	}

	/**
	 * 展示
	 */
	public void show(){
		System.out.printf("%s %s %s", name, sex, age);
		System.out.println();
		System.out.printf("工作经历 %s %s", timeArea, company);
		System.out.println();
	}

	/**
	 * 调用super.clone()方法，可以实现对该类的复制
	 * @return
	 */
	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return new Resume1("not support clone");
		}
	}
	
}
