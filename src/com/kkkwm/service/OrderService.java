package com.kkkwm.service;

import java.sql.Timestamp;
import java.util.List;

import com.kkkwm.pojo.*;

public interface OrderService {
	public List<Order> getOrderAll();
	public List<Order> getOrderByShop(String shop_id);
	public Order getOrderByOn(String order_on);
	public int updateOrder(Order order);
	public int buildOrder(Timestamp date, String order_on, String order_address, double totalprice, Cart cart, String user_id);
	public List<Order> getOrderAllByUser(String user_id);
	public List<Order> getOrderAllByStatus(int order_status);
}
