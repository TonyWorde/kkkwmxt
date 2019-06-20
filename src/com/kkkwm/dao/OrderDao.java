package com.kkkwm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.Order;

@Repository
public interface OrderDao {
	public int insertOrder(Order order);
	public int deleteOrderByOn(String order_on);
	public int updateOrder(Order order);
	public Order getOrder(String order_on);
	public List<Order> getOrderAll();
	public List<Order> getOrderAllByUser(String user_id);
	public List<Order> getOrderAllByShop(String shop_id);
	public List<Order> getOrderAllByRider(String rider_id);
	public List<Order> getOrderAllByStatus(@Param("order_status") int order_status);
	
}
