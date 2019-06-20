package com.kkkwm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkkwm.dao.AdminDao;
import com.kkkwm.pojo.Admin;
import com.kkkwm.service.AdminService;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService
{
	@Autowired
//@Qualifier("adminDao")
	private AdminDao adminDao;
	
	@Override
	public Admin selectAdminById(String ad_id,String ad_pwd) {
		Admin ad = adminDao.getAdmin(ad_id);
		
		if(ad==null){
			return null;
		}else{
			if(ad.getAd_id().equals(ad_id)&&ad.getAd_pwd().equals(ad_pwd))
				return ad;
			else
				return null;
		}
	}

	@Override
	public Admin selectAdminById(String ad_id) {
		Admin ad = adminDao.getAdmin(ad_id);
		
		if(ad==null)
			return null;
		else
			return ad;
		
	}

	@Override
	public int updateAdmin(Admin admin) {
		int i = adminDao.updateAdmin(admin);
		if(i == 0)
			return 0;
		else return 1;
	}

}
