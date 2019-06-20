package com.kkkwm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kkkwm.pojo.*;
import com.kkkwm.service.*;

@Controller
public class RegisterController 
{
	@Autowired
	private SellerService sellerService;
	@Autowired
	private RiderService riderService;
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="sellerCheck", method=RequestMethod.GET)
	public String sellerRigisterInit(Seller seller, Model model){
		model.addAttribute("seller", seller);
		return "admin/sellerCheck";
	}
	
	@RequestMapping(value="sellerregist", method=RequestMethod.POST)
	public String SellerRegist(@Valid Seller seller, BindingResult result)
	{
		if(result.hasErrors())
			return "admin/sellerCheck";
		else
		{
			int i = sellerService.registSeller(seller);
			if(i==0)
				return "admin/registFail";
			else return "admin/registSuccess";
		}
		
	}
	
	
	@RequestMapping(value="riderCheck", method=RequestMethod.GET)
	public String reiderRigisterInit(Rider rider, Model model){
		model.addAttribute("rider", rider);
		return "admin/riderCheck";
	}
	
	@RequestMapping(value="riderregist", method=RequestMethod.POST)
	public String RiderRegist(@Valid Rider rider, BindingResult result)
	{
		if(result.hasErrors())
			return "admin/riderCheck";
		else
		{
			int i = riderService.registRider(rider);
			if(i==0)
				return "admin/registFail";
			else return "admin/registSuccess";
		}
		
	}
	
	@RequestMapping(value="userCheck", method=RequestMethod.GET)
	public String userRigisterInit(User user, Model model){
		model.addAttribute("user", user);
		return "user/userCheck";
	}
	
	@RequestMapping(value="userregist", method=RequestMethod.POST)
	public String UserRegist(@Valid User user, BindingResult result)
	{
		if(result.hasErrors())
			return "user/userCheck";
		else
		{
			int i = userService.registUser(user);
			if(i==0)
				return "user/registFail";
			else return "user/registSuccess";
		}
		
	}

}
