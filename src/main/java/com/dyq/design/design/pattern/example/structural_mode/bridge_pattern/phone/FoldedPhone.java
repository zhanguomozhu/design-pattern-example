package com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.phone;

import com.dyq.design.design.pattern.example.structural_mode.bridge_pattern.brand.Brand;


/**
 * 折叠样式手机
 * @author Administrator
 */
public class FoldedPhone extends Phone {

   public FoldedPhone(Brand brand) {
       super(brand);
   }
   @Override
   public void open(){
       super.open();
       System.out.println("折叠样式手机开机");
   }
   @Override
   public void close(){
       super.close();
       System.out.println("折叠样式手机关机");
   }
   @Override
   public void call(){
       super.call();
       System.out.println("折叠样式手机打电话");
   }
}