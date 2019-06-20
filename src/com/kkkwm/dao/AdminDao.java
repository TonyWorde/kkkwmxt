package com.kkkwm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.kkkwm.pojo.Admin;

@Repository
public interface AdminDao 
{
	public int insertAdmin(Admin admin);
	public int deleteAdmin(String ad_id);
	public int updateAdmin(Admin admin);
	public Admin getAdmin(String ad_id);
	public List<Admin> getAdminAll();

}
