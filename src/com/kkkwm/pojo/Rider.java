package com.kkkwm.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Rider 
{
	@NotNull(message="ID账号不能为空")
	@Size(min=6,max=16,message="ID账号必须在6-16个字符串之间")
	private String rider_id;
	
	@NotNull(message="密码不能为空")
	@Size(min=6,max=16,message="密码必须在6-16个字符串之间且不能用中文")
	private String rider_pwd;
	
	private String rider_name;
	
	private String rider_sex;
	
	@NotNull(message="手机号码不能为空")
	@Pattern(regexp="^1[035678]\\d{9}$",message="请输入正确的手机号码")
	private String rider_phone;
	
	public String getRider_id() {
		return rider_id;
	}
	public void setRider_id(String ri_id) {
		this.rider_id = ri_id;
	}
	public String getRider_pwd() {
		return rider_pwd;
	}
	public void setRider_pwd(String ri_pwd) {
		this.rider_pwd = ri_pwd;
	}
	public String getRider_name() {
		return rider_name;
	}
	public void setRider_name(String ri_name) {
		this.rider_name = ri_name;
	}
	public String getRider_sex() {
		return rider_sex;
	}
	public void setRider_sex(String ri_sex) {
		this.rider_sex = ri_sex;
	}
	public String getRider_phone() {
		return rider_phone;
	}
	public void setRider_phone(String ri_phone) {
		this.rider_phone = ri_phone;
	}
	
	
	
}
