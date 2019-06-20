package com.kkkwm.controller;

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
public class CartController {
	
	@Autowired
	private CartService cartService;
	@Autowired
	private FoodService foodService;
	@Autowired
	private ShopService shopService;
	
	@RequestMapping(value="addCart", method=RequestMethod.GET)
	public String addCart(@RequestParam String food_id, @RequestParam String shop_id, HttpSession session){
		String user_id  = (String) session.getAttribute("id");
		List<Cart> cartlist = cartService.getCart(user_id);
		String shop_name = shopService.getShopName(shop_id);
		
		if((cartlist == null)||cartlist.isEmpty())
		{
			Food food = foodService.getFood(food_id, shop_id);
			Cart cart = new Cart();
			cart.setCart_num(1);
			cart.setCart_total(food.getFood_price());
			cart.setFood_id(food_id);
			cart.setFood_name(food.getFood_name());
			cart.setFood_price(food.getFood_price());
			cart.setShop_id(shop_id);
			cart.setUser_id(user_id);
			cart.setShop_name(shop_name);
			cartService.insertCart(cart);
		}
		else
		{
			if(!(cartlist.get(0).getShop_id()).equals(shop_id))
			{
				cartService.deleteCartUser(user_id);
				Food food = foodService.getFood(food_id, shop_id);
				Cart cart = new Cart();
				cart.setCart_num(1);
				cart.setCart_total(food.getFood_price());
				cart.setFood_id(food_id);
				cart.setFood_name(food.getFood_name());
				cart.setFood_price(food.getFood_price());
				cart.setShop_id(shop_id);
				cart.setUser_id(user_id);
				cart.setShop_name(shop_name);
				cartService.insertCart(cart);
			}
			else
			{
				Cart cart = cartService.getCartByID(food_id, shop_id);
				if(cart == null)
				{
					Cart ca = new Cart();
					Food food = foodService.getFood(food_id, shop_id);
					ca.setCart_num(1);
					ca.setCart_total(food.getFood_price());
					ca.setFood_id(food_id);
					ca.setFood_name(food.getFood_name());
					ca.setFood_price(food.getFood_price());
					ca.setShop_id(shop_id);
					ca.setUser_id(user_id);
					ca.setShop_name(shop_name);
					cartService.insertCart(ca);
				}
				else
				{
					int k = cart.getCart_num();
					cart.setCart_num(++k);
					cart.setCart_total(cart.getCart_num() * cart.getFood_price());
					cartService.updateCart(cart);
				}
			}
		}
		return "redirect:showFood?shop_id="+shop_id;
	}
	
	@RequestMapping(value="myCart", method=RequestMethod.GET)
	public ModelAndView myCart(ModelAndView mv, HttpSession session){
		List<Cart> cart = cartService.getCart((String)session.getAttribute("id"));
		double totalprice = 0;
		for(Cart list : cart)
			totalprice += list.getCart_total();
		mv.addObject("totalprice", totalprice);
		mv.addObject("cartlist", cart);
		mv.setViewName("user/myCart");
		return mv;
	}
	
	@RequestMapping(value="changeCart", method=RequestMethod.GET)
	public ModelAndView changeNum(@RequestParam String param, @RequestParam String cart_id, 
			HttpSession session)
	{
		Cart cart = cartService.getCartByCart(cart_id);
		if(param.equals("add"))
		{
			cart.setCart_num(cart.getCart_num() + 1);
			cart.setCart_total(cart.getFood_price() * cart.getCart_num());
			cartService.updateCart(cart);
		}
		
		if(param.equals("minus"))
		{
			if(cart.getCart_num() <= 1)
			{
				cartService.deleteCartByID(cart_id);
			}
			
			else{
				cart.setCart_num(cart.getCart_num() - 1);
				cart.setCart_total(cart.getFood_price() * cart.getCart_num());
				cartService.updateCart(cart);
			}
		}
		return new ModelAndView("redirect:myCart", null);
	}
	
	@RequestMapping(value="account", method=RequestMethod.GET)
	public ModelAndView account(ModelAndView mv, HttpSession session){
		List<Cart> cart = cartService.getCart((String)session.getAttribute("id"));
		double totalprice = 0;
		for(Cart list : cart)
			totalprice += list.getCart_total();
		mv.addObject("totalprice", totalprice);
		mv.addObject("cartlist", cart);
		mv.setViewName("user/account");
		return mv;
	}

}
