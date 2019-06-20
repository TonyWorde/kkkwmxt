package com.kkkwm.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kkkwm.pojo.*;
import com.kkkwm.service.*;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private ShopService shopService;
	@Autowired
	private UserService userService;
	@Autowired
	private CartService cartService;
	@Autowired
	private OrderItemService orderItemService;
	
	@RequestMapping("getAllOrder")
	public ModelAndView getAllOrder(ModelAndView mv){
		List<Order> order = orderService.getOrderAll();
		mv.addObject("orderall", order);
		mv.setViewName("admin/getAllOrder");
		return mv;
	}
	
	@RequestMapping("orderManageInSeller")
	public ModelAndView getShopOrder(HttpSession session, ModelAndView mv){
		String seller_id = (String) session.getAttribute("id");
		String shop_id = shopService.getShopID(seller_id);
		
		List<Order> order = orderService.getOrderByShop(shop_id);
		
		mv.addObject("orderlist", order);
		mv.setViewName("seller/orderManage");
		return mv;
	}
	
	@RequestMapping(value="acceptOrder", method=RequestMethod.GET)
	public String acceptOrder(@RequestParam String order_on){
		Order order = orderService.getOrderByOn(order_on);
		if(order.getOrder_status() == 1)
		{
			order.setOrder_status(3);
//			order.setRider_id("null");
			int i = orderService.updateOrder(order);
			if(i != 0)
				return "seller/updateOrderSuccess";
			else return "seller/updateOrderFail";
		}
		else return "seller/updateOrderFail";
	}
	
	@RequestMapping(value="avaliable", method=RequestMethod.GET)
	public String avaliableOrder(@RequestParam String order_on){
		Order order = orderService.getOrderByOn(order_on);
		if(order.getOrder_status() == 3)
		{
			order.setOrder_status(4);
//			order.setRider_id("null");
			int i = orderService.updateOrder(order);
			if(i != 0)
				return "seller/updateOrderSuccess";
			else return "seller/updateOrderFail";
		}
		else return "seller/updateOrderFail";
	}
	
	@RequestMapping(value="refuse", method=RequestMethod.GET)
	public String refuseOrder(@RequestParam String order_on){
		Order order = orderService.getOrderByOn(order_on);
		if(order.getOrder_status() == 1)
		{
			order.setOrder_status(2);
//			order.setRider_id("null");
			int i = orderService.updateOrder(order);
			if(i != 0)
				return "seller/updateOrderSuccess";
			else return "seller/updateOrderFail";
		}
		else return "seller/updateOrderFail";
	}
	
	@RequestMapping(value="payOrder", method=RequestMethod.POST)
	public String payOrder(String order_address, HttpSession session){
		
		String user_id = (String) session.getAttribute("id");
		User user = userService.getUser(user_id);
		List<Cart> cart = cartService.getCart(user_id);
		double totalprice = 0;
		
		for(Cart list : cart)
			totalprice += list.getCart_total();
		if(totalprice > user.getUser_balance())
			return "user/payFail";
		
		else
		{
			Timestamp date = new Timestamp(System.currentTimeMillis());
			int i = (int) (Math.random()*900 + 100);
			String order_on = date.toString() + i;
			
			orderService.buildOrder(date, order_on, order_address, totalprice, cart.get(0), user_id);
			orderItemService.buildOrderItem(cart, order_on);
			cartService.deleteCartUser(user_id);
			user.setUser_balabce(user.getUser_balance() - totalprice);
			userService.updateUser(user);
			return "user/paySuccess";
		}
		
	}
	
	@RequestMapping("getUserOrder")
	public ModelAndView getOrder(ModelAndView mv,HttpSession session){
		String user_id = (String) session.getAttribute("id");
		List<Order> order = orderService.getOrderAllByUser(user_id);
		mv.addObject("Userorder", order);
		mv.setViewName("user/getOrder");
		return mv;
	}
	
	@RequestMapping("getStatusFourOrder")
	public ModelAndView getStatusFourOrder(ModelAndView mv){
		List<Order> order = orderService.getOrderAllByStatus(4);
		mv.addObject("orderlist", order);
		mv.setViewName("rider/statusFourOrder");
		return mv;
	}
	
	@RequestMapping(value="getStatusFiveOrder", method=RequestMethod.GET)
	public ModelAndView getStatusFiveOrder(ModelAndView mv, HttpSession session){
		List<Order> order = orderService.getOrderAllByStatus(5);
		List<Order> orderlist = new ArrayList<Order>();
		String rider_id = (String) session.getAttribute("id");
		
		if(order != null)
		{
			for(int i=0; i<order.size(); ++i)
			{
				if(order.get(i).getRider_id().equals(rider_id))
				{
					orderlist.add(order.get(i));
				}
			}
		}
		
		mv.addObject("orderlist", orderlist);
		mv.setViewName("rider/statusFiveOrder");
		return mv;
	}
	
	@RequestMapping(value="grabOrder", method=RequestMethod.GET)
	public String grabOrder(@RequestParam("order_on") String order_on, HttpSession session){
		String rider_id = (String) session.getAttribute("id");
		Order order = orderService.getOrderByOn(order_on);
		if(order.getOrder_status() == 4){
			order.setOrder_status(5);
			order.setRider_id(rider_id);
			orderService.updateOrder(order);
		}
		return "rider/grabOrderSuccess";
	}
	
	@RequestMapping(value="getSendOrder", method=RequestMethod.GET)
	public ModelAndView sendOrder(ModelAndView mv, HttpSession session){
		String user_id = (String) session.getAttribute("id");
		List<Order> order = orderService.getOrderAllByStatus(5);
		List<Order> orderlist = new ArrayList<Order>();
		
		if(order != null)
		{
			for(int i=0; i<order.size(); ++i)
			{
				if(order.get(i).getUser_id().equals(user_id))
				{
					orderlist.add(order.get(i));
				}
			}
		}
		
		mv.addObject("orderlist", orderlist);
		mv.setViewName("user/getSendOrder");
		return mv;
	}
	
	@RequestMapping(value="arrive", method=RequestMethod.GET)
	public String arriveOrder(@RequestParam("order_on") String order_on){
		Order order = orderService.getOrderByOn(order_on);
		order.setOrder_status(6);
		orderService.updateOrder(order);
		return "user/arriveSuccess";
	}
}
