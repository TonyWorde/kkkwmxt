package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkkwm.dao.OrderItemDao;
import com.kkkwm.pojo.Cart;
import com.kkkwm.pojo.OrderItem;
import com.kkkwm.service.OrderItemService;

@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService{
	
	@Autowired
	private OrderItemDao orderItemDao;

	@Override
	public List<OrderItem> getOrderItem(String order_on) {
		List<OrderItem> orderItem = orderItemDao.getOrderItemAll(order_on);
		if(orderItem==null)
			return null;
		else return orderItem;
	}

	@Override
	public int insertOrderItem(OrderItem orderitem) {
		int i = orderItemDao.insertOrderItem(orderitem);
		return i;
	}

	@Override
	public int buildOrderItem(List<Cart> cart, String order_on) {
		int i = 0;
		for(int k =0; k<cart.size(); ++k)
		{
			OrderItem oi = new OrderItem();
			oi.setOrder_on(order_on);
			oi.setFood_id(cart.get(k).getFood_id());
			oi.setFood_name(cart.get(k).getFood_name());
			oi.setFood_num(cart.get(k).getCart_num());
			oi.setFood_price(cart.get(k).getFood_price());
			oi.setFood_total(cart.get(k).getCart_total());
			oi.setShop_id(cart.get(k).getShop_id());
			oi.setShop_name(cart.get(k).getShop_name());
			oi.setUser_id(cart.get(k).getUser_id());
			i = orderItemDao.insertOrderItem(oi);
		}
		return i;
	}

}
