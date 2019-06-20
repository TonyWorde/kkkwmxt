package com.kkkwm.service;

import java.util.List;


import com.kkkwm.pojo.Rider;

public interface RiderService {
	
	public Rider selectRiderById(String ri_id,String ri_pwd);
	public List<Rider> allRider();
	public int registRider(Rider rider);
	public int deleteRider(String rider_id);
	public Rider getRider(String rider_id);
	public int updateRider(Rider rider);
}

