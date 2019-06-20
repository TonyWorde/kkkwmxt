package com.kkkwm.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kkkwm.pojo.Admin;
import com.kkkwm.service.AdminService;


@Controller
public class AdminController 
{
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="getAdmin")
	public ModelAndView getAdmin(HttpSession session, ModelAndView mv){
		String id = (String) session.getAttribute("id");
		Admin admin = adminService.selectAdminById(id);
		mv.addObject("admin", admin);
		mv.setViewName("admin/getAdmin");
		return mv;
	}
	
	@RequestMapping(value="toUpdateAdmin", method=RequestMethod.GET)
	public String toUpdateAdmin(Admin admin, Model model){
		model.addAttribute("admin", admin);
		return "admin/updateAdmin";
	}
	
	@RequestMapping(value="updateAdmin", method=RequestMethod.POST)
	public String updateAdmin(HttpSession session, @Valid Admin admin, BindingResult result){
		String id = (String) session.getAttribute("id");
		Admin ad = adminService.selectAdminById(id);
		
		if(result.hasErrors())
			return "admin/updateAdmin";
		else{
			ad.setAd_pwd(admin.getAd_pwd());
			ad.setAd_name(admin.getAd_name());
			ad.setAd_sex(admin.getAd_sex());
			ad.setAd_phone(admin.getAd_phone());
			
			int i = adminService.updateAdmin(ad);
			if(i == 0)
				return "admin/updateFail";
			else return "admin/updateSuccess";
		}
	}
	
	
	@RequestMapping("toAdminHomePage")
	public String HomePage(){
		return "admin/homePage";
	}

}
