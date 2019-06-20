package com.kkkwm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.Rider;

@Repository
public interface RiderDao {
	
	public int insertRider(Rider rider);
	public int deleteRider(String rider_id);
	public int updateRider(Rider rider);
	public Rider getRider(String rider_id);
	public List<Rider> getRiderAll();

}
