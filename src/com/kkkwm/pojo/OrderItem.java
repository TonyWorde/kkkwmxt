package com.kkkwm.pojo;

public class OrderItem {
	private int item_id;
	private String order_on;//用户ID + 时间 + 三位随机数字
	private String food_id;
	private String food_name;
	private double food_price;
	private int food_num;
	private double food_total; //此订单项总价
	private String user_id;
	private String shop_id;
	private String shop_name;
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getOrder_on() {
		return order_on;
	}
	public void setOrder_on(String order_on) {
		this.order_on = order_on;
	}
	public String getFood_id() {
		return food_id;
	}
	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public double getFood_price() {
		return food_price;
	}
	public void setFood_price(double food_price) {
		this.food_price = food_price;
	}
	public int getFood_num() {
		return food_num;
	}
	public void setFood_num(int food_num) {
		this.food_num = food_num;
	}
	public double getFood_total() {
		return food_total;
	}
	public void setFood_total(double food_total) {
		this.food_total = food_total;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

}
