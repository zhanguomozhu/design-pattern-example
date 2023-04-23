package com.dyq.design.design.pattern.example.creation_mode.prototype_pattern;

/**
 * 简历类3
 */
public class Resume3 implements Cloneable {
	
	private String name;
	private String sex;
	private int age;

	protected WorkExperience2 workExperience;

	public Resume3(String name) {
		this.name = name;
		this.workExperience = new WorkExperience2();
	}

	public void setPersonalInfo(String sex, int age) {
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExperience(String timeArea, String company) {
		workExperience.setTimeArea(timeArea);
		workExperience.setCompany(company);
	}

	public void show() {
		System.out.printf("%s %s %s", name, sex, age);
		System.out.printf("   工作经历 %s %s", workExperience.getTimeArea(), workExperience.getCompany());
		System.out.println();
	}

	/**
	 * 调整原先的clone方法，将workExperience属性也进行复制操作
	 * @return
	 */
	@Override
	public Object clone() {
		try {
			Resume3 obj = (Resume3) super.clone();
			obj.workExperience = (WorkExperience2) this.workExperience.clone();
			return obj;
		} catch (CloneNotSupportedException e) {
			System.out.println("clone error:" + e.getMessage());
			return new Resume3("error");
		}
	}

}
