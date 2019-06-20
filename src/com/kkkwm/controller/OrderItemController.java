package com.kkkwm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kkkwm.pojo.OrderItem;
import com.kkkwm.service.OrderItemService;

@Controller
public class OrderItemController {
	
	@Autowired
	private OrderItemService orderItemService;
	
	@RequestMapping(value="getItem",method=RequestMethod.GET)
	public ModelAndView getOrderItem(@RequestParam String order_on, ModelAndView mv){
		List<OrderItem> itemlist = orderItemService.getOrderItem(order_on);
		mv.addObject("orderitem", itemlist);
		mv.setViewName("admin/getItem");
		return mv;
	}
	
	@RequestMapping(value="getItemShop", method=RequestMethod.GET)
	public ModelAndView getOrderItemShop(@RequestParam String order_on, ModelAndView mv){
		List<OrderItem> item = orderItemService.getOrderItem(order_on);
		mv.addObject("orderitem", item);
		mv.setViewName("seller/getItem");
		return mv;
	}
	
	@RequestMapping(value="getUserItem",method=RequestMethod.GET)
	public ModelAndView getUserOrderItem(@RequestParam String order_on, ModelAndView mv){
		List<OrderItem> itemlist = orderItemService.getOrderItem(order_on);
		mv.addObject("orderitem", itemlist);
		mv.setViewName("user/getItem");
		return mv;
	}
	
}
