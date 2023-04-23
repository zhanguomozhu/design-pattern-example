package com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.phone;

import com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.brand.Brand;

/**
 * 手机类
 */
public abstract class Phone {
    private Brand brand;
    public void Phone(){

    }
    public Phone(Brand brand) {
        this.brand = brand;
    }
    public void open(){
        this.brand.open();
    }
    public void close(){
        this.brand.close();
    }
    public void call(){
        this.brand.call();
    }
}
