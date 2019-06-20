package com.kkkwm.pojo;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User 
{
	@NotNull(message="ID账号不能为空")
	@Size(min=6,max=16,message="ID账号必须在6-16个字符串之间且不能用中文")
	private String user_id;
	
	@NotNull(message="密码不能为空")
	@Size(min=6,max=16,message="密码必须在6-16个字符串之间且不能用中文")
	private String user_pwd;
	
	private String user_name;
	
	private String user_sex;
	
	@NotNull(message="手机号码不能为空")
	@Pattern(regexp="^1[035678]\\d{9}$",message="请输入正确的手机号码")
	private String user_phone;
	
	@Digits(integer=3, fraction=2, message="一次充值金额上限999.99元")
	@DecimalMin(value="0.00", message="最低充值0元")
	private double user_balance;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public double getUser_balance() {
		return user_balance;
	}
	public void setUser_balabce(double user_balance) {
		this.user_balance = user_balance;
	}
	
}
