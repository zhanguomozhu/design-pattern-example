package com.dyq.design.design.pattern.example.structural_mode.composite_pattern;

import java.util.Collections;

/**
 * 树叶节点公司实体类
 * 财务部
 */
public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company company) {}

	@Override
	public void remove(Company company) {}

	@Override
	public void show(int depth) {
		System.out.println(String.join("-", Collections.nCopies(depth, "-")) + name);
	}

	@Override
	public void duty(int depth) {
		System.out.println(String.join("-", Collections.nCopies(depth, "-")) + name + ":公司财务收支管理");
	}

}
