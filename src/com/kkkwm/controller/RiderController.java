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

import com.kkkwm.pojo.Rider;
import com.kkkwm.service.RiderService;

@Controller
public class RiderController {
	
	@Autowired
	private RiderService riderService;
	
	@RequestMapping("getAllRider")
	public ModelAndView getAllRider(ModelAndView mv){
		List<Rider> rider = riderService.allRider();
		mv.addObject("riderlist", rider);
		mv.setViewName("admin/getAllRider");
		return mv;
	}
	
	@RequestMapping(value="deleteRider", method=RequestMethod.GET)
	public String deleteRider(@RequestParam String rider_id){
		int i = riderService.deleteRider(rider_id);
		if(i == 0)
			return "admin/deleteFail";
		else return "admin/deleteSuccess";
	}
	
	@RequestMapping(value="riderManage", method=RequestMethod.GET)
	public ModelAndView getRider(ModelAndView mv, HttpSession session){
		Rider rider = riderService.getRider((String)session.getAttribute("id"));
		mv.addObject("rider", rider);
		mv.setViewName("rider/riderManage");
		return mv;
	}
	
	@RequestMapping("toRiderHomePage")
	public String toHomePage(){
		return "rider/homePage";
	}
	
	@RequestMapping(value="toUpdateRider", method=RequestMethod.GET)
	public String toUpdate(Rider rider, Model model){
		model.addAttribute("rider", rider);
		return "rider/updateRider";
	}
	
	@RequestMapping(value="updateRider", method=RequestMethod.POST)
	public String update(@Valid Rider rider, BindingResult result){
		if(result.hasErrors())
			return "rider/updateRider";
		else{
			int i = riderService.updateRider(rider);
			if(i == 0)
				return "rider/updateFail";
			else return "rider/updateSuccess";
		}
	}

}
