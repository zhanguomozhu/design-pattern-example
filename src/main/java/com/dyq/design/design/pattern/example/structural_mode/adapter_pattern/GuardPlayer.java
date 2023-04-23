package com.dyq.design.design.pattern.example.structural_mode.adapter_pattern;

/**
 * 后卫类
 */
public class GuardPlayer extends Player {
	
    public GuardPlayer(String name) {
        super(name);
    }
    
    @Override
    public void attack() {
        System.out.println("后卫" + name + "进攻");
    }
    
    @Override
    public void defense() {
        System.out.println("后卫" + name + "防守");
    }
    
}
