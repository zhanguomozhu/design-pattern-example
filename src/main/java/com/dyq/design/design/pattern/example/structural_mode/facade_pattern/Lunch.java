package com.dyq.design.design.pattern.example.structural_mode.facade_pattern;

/**
 * 门面类
 */
public class Lunch {
	
	private Restaurant restaurant;
	private Chef chef;
	private Courier courier;

	public Lunch() {
		this.restaurant = new Restaurant();
		this.chef = new Chef();
		this.courier = new Courier();
	}

	public void orderLunch(){
		// 点外卖后，外卖软件通知商家接单
		restaurant.receiveOrder();
		// 商家接单后，通知厨师开始制作午餐
		chef.cook();
		// 骑手准备去商家取货配送
		courier.transport();
	}
	
}
