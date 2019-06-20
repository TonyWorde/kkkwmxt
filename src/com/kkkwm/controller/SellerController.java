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

import com.kkkwm.pojo.Seller;
import com.kkkwm.service.SellerService;

@Controller
public class SellerController 
{
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("toSellerHomePage")
	public String toHomePage(){
		return "seller/homePage";
	}
	
	@RequestMapping("getAllSeller")
	public ModelAndView getAllSeller(ModelAndView mv)
	{
		List<Seller> seller = sellerService.allSeller();
		mv.addObject("sellerlist", seller);
		mv.setViewName("admin/getAllSeller");
		return mv;
	}
	
	@RequestMapping(value="deleteSeller", method=RequestMethod.GET)
	public String deleteSeller(@RequestParam String seller_id){
		int i = sellerService.deleteSeller(seller_id);
		if(i == 0)
			return "admin/deleteFail";
		else return "admin/deleteSuccess";
	}
	
	@RequestMapping(value="sellerManageInSeller")
	public ModelAndView getSeller(ModelAndView mv , HttpSession session){
		String seller_id = (String) session.getAttribute("id");
		Seller seller = sellerService.getSeller(seller_id);
		mv.addObject("seller", seller);
		mv.setViewName("seller/sellerManage");
		return mv;
	}
	
	@RequestMapping(value="toUpdateSeller", method=RequestMethod.GET)
	public String toUpdate(Seller seller, Model model){
		model.addAttribute("seller", seller);
		return "seller/updateSeller";
	}
	
	@RequestMapping(value="updateSeller", method=RequestMethod.POST)
	public String update(@Valid Seller seller, BindingResult result){
		if(result.hasErrors())
			return "seller/updateSeller";
		else{
			int i = sellerService.updateSeller(seller);
			if(i == 0)
				return "seller/updateFail";
			else return "seller/updateSuccess";
		}
	}

}
