package com.dyq.design.design.pattern.example.structural_mode.composite_pattern;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 树枝节点公司实体类
 */
public class ConcreteCompany extends Company {

    private ArrayList<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void show(int depth) {
        System.out.println(String.join("-", Collections.nCopies(depth, "-")) + name);
        for (Company company : children) {
            company.show(depth + 1);
        }
    }

    @Override
    public void duty(int depth) {
        System.out.println(String.join("-", Collections.nCopies(depth, "-")) + name + "公司");
        for (Company company : children) {
            company.duty(depth + 1);
        }
    }

}
