package com.dyq.design.design.pattern.example.structural_mode.facade_pattern;

/**
 * 外观模式
 * 外观模式（Facade），为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 *
 * 举例：
 * 现在很多人都喜欢点外卖，点外卖的流程很简单，你只需要选择了想吃的东西，然后等着外卖小哥送货上门就可以了，
 * 至于外卖软件怎么通知店家，中间店家怎么做菜，做完后怎么分配骑手的过程都不需要你操心，这个流程就可以用外观模式来实现。
 */
public class Test {
	
    public static void main(String[] args) {
        System.out.println("=== 饿了，点个外卖吧 ===");
        Lunch lunch = new Lunch();
        lunch.orderLunch();
        System.out.println("=== 收到外卖，可以开始吃了 ===");
    }
    
}
