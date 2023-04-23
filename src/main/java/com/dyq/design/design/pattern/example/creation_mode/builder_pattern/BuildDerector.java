package com.dyq.design.design.pattern.example.creation_mode.builder_pattern;

/**
 * 指挥者类
 */
public class BuildDerector {
	
    public void BuildPerson(IBuilder builder) {
        builder.buildSex();
        builder.buildCloth();
        builder.buildWeapon();
    }
    
}
