package com.kkkwm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.OrderItem;

@Repository
public interface OrderItemDao {
	public int insertOrderItem(OrderItem orderitem);
	public int deleteOrderItem(String order_on);
	public List<OrderItem> getOrderItemAll(@Param("order_on")String order_on);

}
