package com.dyq.design.design.pattern.example.structural_mode.composite_pattern;

/**
 * 公司类
 */
public abstract class Company {
	
    String name;
    
    public Company(String name) {
        this.name = name;
    }
    
    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void show(int depth); // 展示结构
    public abstract void duty(int depth); // 履行职责
    
}
