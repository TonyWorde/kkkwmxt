package com.kkkwm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kkkwm.pojo.Shop;
import com.kkkwm.service.ShopService;

@Controller
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping("shopManage")
	public ModelAndView shopManage(ModelAndView mv, HttpSession session){
		String seller_id = (String) session.getAttribute("id");
		Shop shop = shopService.getShopBySeller(seller_id);
		mv.addObject("shop", shop);
		mv.setViewName("seller/shopManage");
		return mv;
	}
	
	@RequestMapping(value="toRegistShop", method=RequestMethod.GET)
	public String toRegistShop(Model model, Shop shop){
		model.addAttribute("shop", shop);
		return "seller/registShop";
	}
	
	@RequestMapping(value="shopRegist", method=RequestMethod.POST)
	public String registShop(@Valid Shop shop, BindingResult result, HttpSession session){
		String seller_id = (String) session.getAttribute("id");
		String shop_id = shopService.getShopID(seller_id);
		Shop sp = shopService.getShopById(shop.getShop_id());
		
		if(shop_id != null)
			return "seller/registFail";
		
		if(sp != null)
			return "seller/registFail";
		
		if(result.hasErrors())
			return "seller/registShop";
		else
		{
			shop.setSeller_id(seller_id);
			shopService.insertShop(shop);
			
			return "seller/registSuccess";

		}
		
	}
	
	@RequestMapping("showShop")
	public ModelAndView showShop(ModelAndView mv){
		List<Shop> shop = shopService.getShop();
		mv.addObject("shoplist", shop);
		mv.setViewName("user/showShop");
		return mv;
	}
	
	@RequestMapping(value="getShop", method=RequestMethod.GET)
	public ModelAndView getShop(@RequestParam("shop_id") String shop_id, ModelAndView mv){
		Shop shop = shopService.getShopById(shop_id);
		mv.addObject("shop", shop);
		mv.setViewName("rider/showShop");
		return mv;
	}

}
