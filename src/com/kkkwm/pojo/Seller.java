package com.kkkwm.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Seller
{
	@NotNull(message="ID账号不能为空")
	@Size(min=6,max=16,message="ID账号必须在6-16个字符串之间")
	private String seller_id;
	
	@NotNull(message="密码不能为空")
	@Size(min=6,max=16,message="密码必须在6-16个字符串之间且不能用中文")
	private String seller_pwd;
	
	private String seller_name;
	
	private String seller_sex;
	
	@NotNull(message="手机号码不能为空")
	@Pattern(regexp="^1[035678]\\d{9}$",message="请输入正确的手机号码")
	private String seller_phone;
	
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String se_id) {
		this.seller_id = se_id;
	}
	public String getSeller_pwd() {
		return seller_pwd;
	}
	public void setSeller_pwd(String se_pwd) {
		this.seller_pwd = se_pwd;
	}
	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String se_name) {
		this.seller_name = se_name;
	}
	public String getSeller_sex() {
		return seller_sex;
	}
	public void setSeller_sex(String se_sex) {
		this.seller_sex = se_sex;
	}
	public String getSeller_phone() {
		return seller_phone;
	}
	public void setSeller_phone(String se_phone) {
		this.seller_phone = se_phone;
	}
	
	

}
