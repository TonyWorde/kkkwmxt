package com.kkkwm.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Rider 
{
	@NotNull(message="ID�˺Ų���Ϊ��")
	@Size(min=6,max=16,message="ID�˺ű�����6-16���ַ���֮��")
	private String rider_id;
	
	@NotNull(message="���벻��Ϊ��")
	@Size(min=6,max=16,message="���������6-16���ַ���֮���Ҳ���������")
	private String rider_pwd;
	
	private String rider_name;
	
	private String rider_sex;
	
	@NotNull(message="�ֻ����벻��Ϊ��")
	@Pattern(regexp="^1[035678]\\d{9}$",message="��������ȷ���ֻ�����")
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
