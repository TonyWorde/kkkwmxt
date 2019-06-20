package com.kkkwm.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Shop {
	@NotNull
	@Size(min=4,max=16,message="ID账号必须在4-16个字符串之间")
	private String shop_id;
	
	private String shop_name;
	
	private String shop_address;
	
	@NotNull(message="手机号码不能为空")
	@Pattern(regexp="^1[035678]\\d{9}$",message="请输入正确的手机号码")
	private String shop_phone;
	
	private String seller_id;
	
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
	public String getShop_address() {
		return shop_address;
	}
	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}
	public String getShop_phone() {
		return shop_phone;
	}
	public void setShop_phone(String shop_phone) {
		this.shop_phone = shop_phone;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	
}
