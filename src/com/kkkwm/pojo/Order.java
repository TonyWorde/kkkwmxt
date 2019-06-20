package com.kkkwm.pojo;

import java.sql.Timestamp;

public class Order {
	private int order_id;
	private String order_on;//用户ID + 时间 + 三位随机数字
	private Timestamp order_time;
	private double order_price;
	private double order_pay;
	private int order_status;  //订单状态，默认0未付款，1已付款，2拒接单，3已接单，4可取货，5已送出，6已完成
	private String order_address;
	private String user_id;
	private String user_phone;
	private String rider_id;
	private String shop_id;
	private String shop_name;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_on() {
		return order_on;
	}
	public void setOrder_on(String order_on) {
		this.order_on = order_on;
	}
	public Timestamp getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Timestamp order_time) {
		this.order_time = order_time;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}
	public double getOrder_pay() {
		return order_pay;
	}
	public void setOrder_pay(double order_pay) {
		this.order_pay = order_pay;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public String getOrder_address() {
		return order_address;
	}
	public void setOrder_address(String order_address) {
		this.order_address = order_address;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRider_id() {
		return rider_id;
	}
	public void setRider_id(String rider_id) {
		this.rider_id = rider_id;
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
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	
	
}
