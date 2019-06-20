package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkkwm.dao.*;
import com.kkkwm.pojo.*;
import com.kkkwm.service.RiderService;


@Service("riderService")
@Transactional
public class RiderServiceImpl implements RiderService{
	
	@Autowired
//	@Qualifier("riderDao")
	private RiderDao riderDao;
	
	@Autowired
	private OrderDao orderDao;


	@Override
	public Rider selectRiderById(String ri_id, String ri_pwd) {
		Rider rider = riderDao.getRider(ri_id);
		
		if(rider==null){
			return null;
		} else{
			if(rider.getRider_id().equals(ri_id)&&rider.getRider_pwd().equals(ri_pwd))
				return rider;
			else
				return null;
		}
		
	}

	@Override
	public List<Rider> allRider() {
		List<Rider> rider = riderDao.getRiderAll();
		
		if(rider==null)
			return null;
		else
			return rider;
	}

	@Override
	public int registRider(Rider rider) {
		Rider re = riderDao.getRider(rider.getRider_id());
		if(re != null)
			return 0;
		else{
			int i = riderDao.insertRider(rider);
			if(i==0)
				return 0;
			else return 1;
		}
		
	}

	@Override
	public int deleteRider(String rider_id) {
		int i = 0;
		List<Order> order = orderDao.getOrderAllByRider(rider_id);
		if((order == null)||(order.isEmpty())){
			i = riderDao.deleteRider(rider_id);
			return i;
		}
		else
		{
			for(Order list : order)
			{
				if(list.getOrder_status() == 5)
					return 0;
			}
			i = riderDao.deleteRider(rider_id);
			return i;
		}
	}

	@Override
	public Rider getRider(String rider_id) {
		Rider rider = riderDao.getRider(rider_id);
		if(rider == null)
			return null;
		else return rider;
	}

	@Override
	public int updateRider(Rider rider) {
		int i = riderDao.updateRider(rider);
		return i;
	}

}
