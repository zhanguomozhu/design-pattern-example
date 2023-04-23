package com.dyq.design.design.pattern.example.structural_mode.adapter_pattern;

/**
 * 前锋类
 */
public class ForwardPlayer extends Player {
	
    public ForwardPlayer(String name) {
        super(name);
    }
    
    @Override
    public void attack() {
        System.out.println("前锋" + name + "进攻");
    }
    
    @Override
    public void defense() {
        System.out.println("前锋" + name + "防守");
    }
    
}
