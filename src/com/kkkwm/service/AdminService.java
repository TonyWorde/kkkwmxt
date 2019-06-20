package com.kkkwm.service;


import com.kkkwm.pojo.Admin;

public interface AdminService 
{
	public Admin selectAdminById(String ad_id,String ad_pwd);
	public Admin selectAdminById(String ad_id);
	public int updateAdmin(Admin admin);

}
