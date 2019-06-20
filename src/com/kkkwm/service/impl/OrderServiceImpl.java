package com.kkkwm.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkkwm.dao.*;
import com.kkkwm.pojo.*;
import com.kkkwm.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private UserDao userDao;

	@Override
	public List<Order> getOrderAll() {
		List<Order> order = orderDao.getOrderAll();
		if(order==null)
			return null;
		else return order;
		
	}

	@Override
	public List<Order> getOrderByShop(String shop_id) {
		List<Order> order = orderDao.getOrderAllByShop(shop_id);
		return order;
	}

	@Override
	public Order getOrderByOn(String order_on) {
		Order order = orderDao.getOrder(order_on);
		if(order == null)
			return null;
		else return order;
	}

	@Override
	public int updateOrder(Order order) {
		int i = orderDao.updateOrder(order);
		return i;
	}

	@Override
	public int buildOrder(Timestamp date, String order_on,
			String order_address, double totalprice, Cart cart, String user_id) 
	{
		User user = userDao.getUser(user_id);
		
		Order order = new Order();
		order.setOrder_address(order_address);
		order.setOrder_on(order_on);
		order.setOrder_pay(totalprice);
		order.setOrder_price(totalprice);
		order.setOrder_status(1);
		order.setOrder_time(date);
		order.setShop_id(cart.getShop_id());
		order.setUser_id(cart.getUser_id());
		order.setShop_name(cart.getShop_name());
		order.setUser_phone(user.getUser_phone());
		
		int i = orderDao.insertOrder(order);
		return i;
	}
	
	@Override
	public List<Order> getOrderAllByUser(String user_id) {
		List<Order> order =orderDao.getOrderAllByUser(user_id);
		return order;
	}

	@Override
	public List<Order> getOrderAllByStatus(int order_status) {
		List<Order> order = orderDao.getOrderAllByStatus(order_status);
		if((order == null)||(order.isEmpty()))
			return null;
		else return order;
	}


}
