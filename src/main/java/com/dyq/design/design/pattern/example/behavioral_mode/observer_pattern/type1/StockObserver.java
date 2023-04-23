package com.dyq.design.design.pattern.example.behavioral_mode.observer_pattern.type1;

/**
 * 看股票的同事
 */
public class StockObserver implements IObserver {
    
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void goToWork() {
        System.out.println(name + "停止炒股，开始工作。");
    }
}
