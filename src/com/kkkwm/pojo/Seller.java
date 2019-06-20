package com.kkkwm.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Seller
{
	@NotNull(message="ID�˺Ų���Ϊ��")
	@Size(min=6,max=16,message="ID�˺ű�����6-16���ַ���֮��")
	private String seller_id;
	
	@NotNull(message="���벻��Ϊ��")
	@Size(min=6,max=16,message="���������6-16���ַ���֮���Ҳ���������")
	private String seller_pwd;
	
	private String seller_name;
	
	private String seller_sex;
	
	@NotNull(message="�ֻ����벻��Ϊ��")
	@Pattern(regexp="^1[035678]\\d{9}$",message="��������ȷ���ֻ�����")
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
