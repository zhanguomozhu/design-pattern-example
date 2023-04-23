package com.dyq.design.design.pattern.example.creation_mode.prototype_pattern;

/**
 * 简历类2
 */
public class Resume2 implements Cloneable {
	
	private String name;
	private String sex;
	private int age;

	/**
	 * 调用workExperience对象
	 */
	WorkExperience workExperience;

	public Resume2(String name) {
		this.name = name;
		workExperience = new WorkExperience();
	}

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
		workExperience.setTimeArea(timeArea);
		workExperience.setCompany(company);
	}

	public void show(){
		System.out.printf("%s %s %s", name, sex, age);
		System.out.printf(" 工作经历 %s %s", workExperience.getTimeArea(), workExperience.getCompany());
		System.out.println();
	}

	@Override
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return new Resume2("not support clone");
		}
	}

}
