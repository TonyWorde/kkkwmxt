package com.kkkwm.pojo;

import javax.validation.constraints.NotNull;

public class Food {
	@NotNull(message="食物编号不能为空")
	private String food_id;
	private String food_name;
	private double food_price;
	private String food_img;
	private String shop_id;
	
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
	public String getFood_img() {
		return food_img;
	}
	public void setFood_img(String food_img) {
		this.food_img = food_img;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}

}
