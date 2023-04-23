package com.dyq.design.design.pattern.example.structural_mode.composite_pattern;


/**
 * 组合模式
 * 组合模式（Composite），将对象组合成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 * 举例：
 * 一个企业做大后，会在全国各地开分公司，总公司有人力资源部和财务部，分公司也有自己的人力资源部和财务部，分公司下还可以有办事处，
 * 办事处也有自己的人力资源部和财务部，但是人力资源部和财务部并没有下属的机构。这种场景就可以用组合模式来实现公司组织架构的展示。
 */
public class Test {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("总公司人力资源部"));
		root.add(new FinanceDepartment("总公司人力资源部"));

		ConcreteCompany comp1 = new ConcreteCompany("华东分公司");
		comp1.add(new HRDepartment("华东分公司人力资源部"));
		comp1.add(new FinanceDepartment("华东分公司人力资源部"));
		root.add(comp1);

		ConcreteCompany comp2 = new ConcreteCompany("南京办事处");
		comp2.add(new HRDepartment("南京办事处人力资源部"));
		comp2.add(new FinanceDepartment("南京办事处人力资源部"));
		comp1.add(comp2);

		ConcreteCompany comp3 = new ConcreteCompany("杭州办事处");
		comp3.add(new HRDepartment("杭州办事处人力资源部"));
		comp3.add(new FinanceDepartment("杭州办事处人力资源部"));
		comp1.add(comp3);

		root.show(1);
		System.out.println("========================");
		root.duty(1);
	}

}
