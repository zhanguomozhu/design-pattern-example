package com.dyq.design.design.pattern.example.creation_mode.prototype_pattern;

/**
 * 工作经历类实现Cloneable接口
 */
public class WorkExperience2 implements Cloneable{
	
	private String timeArea;
	private String company;

	/**
	 * 采用clone方法复制，将生成新的对象
	 * @return
	 */
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("clone error:" + e.getMessage());
			return new WorkExperience2();
		}
	}
	
	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
