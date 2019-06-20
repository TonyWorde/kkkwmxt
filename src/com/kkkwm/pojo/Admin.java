package com.kkkwm.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Admin 
{
	private String ad_id;
	
	@NotNull(message="密码不能为空")
	@Size(min=6,max=16,message="密码必须在6-16个字符串之间且不能用中文")
	private String ad_pwd;
	
	private String ad_name;
	
	private String ad_sex;
	
	@NotNull(message="手机号码不能为空")
	@Pattern(regexp="^1[035678]\\d{9}$",message="请输入正确的手机号码")
	private String ad_phone;
	
	public String getAd_id() {
		return ad_id;
	}
	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}
	public String getAd_pwd() {
		return ad_pwd;
	}
	public void setAd_pwd(String ad_pwd) {
		this.ad_pwd = ad_pwd;
	}
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	public String getAd_sex() {
		return ad_sex;
	}
	public void setAd_sex(String ad_sex) {
		this.ad_sex = ad_sex;
	}
	public String getAd_phone() {
		return ad_phone;
	}
	public void setAd_phone(String ad_phone) {
		this.ad_phone = ad_phone;
	}
	
}
