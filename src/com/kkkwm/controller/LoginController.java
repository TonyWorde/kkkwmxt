package com.kkkwm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.kkkwm.pojo.*;
import com.kkkwm.service.*;

@Controller
@SessionAttributes(value={"id"})
public class LoginController {

	@Autowired
//	@Qualifier("adminService")
	private AdminService adminService;
	@Autowired
//	@Qualifier("userService")
	private UserService userService;
	@Autowired
//	@Qualifier("sellerService")
	private SellerService sellerService;
	@Autowired
//	@Qualifier("riderService")
	private RiderService riderService;

	@RequestMapping(value = "tologin")
	public String tologin() {
		return "login";
	}

	// @RequestParam(value="id",required=false) id可以为空，默认不可为空
	
	@RequestMapping("toIndex")
	public String toIndex(){
		return "redirect:/index.jsp";
	}

	@RequestMapping(value = "login")
	public String login(String id, String pwd, String person, Model model) {

		if ((id == null) || (pwd == null)) {
			return "loginFail";
		} else {

			if (person.equals("admin")) {
				Admin ad = adminService.selectAdminById(id, pwd);
				if (ad != null) {
					model.addAttribute("id", id);
					model.addAttribute("name", ad.getAd_name());
					return "admin/homePage";
				} else
					return "loginFail";
			}

			if (person.equals("user")) {
				User user = userService.selectUserById(id, pwd);
				if (user != null) {
					model.addAttribute("id", id);
					model.addAttribute("name", user.getUser_name());
					return "user/homePage";
				} else
					return "loginFail";
			}

			if (person.equals("seller")) {
				Seller seller = sellerService.selectSellerById(id, pwd);
				if (seller != null) {
					model.addAttribute("id", id);
					model.addAttribute("name", seller.getSeller_name());
					return "seller/homePage";
				} else
					return "loginFail";
			}

			if (person.equals("rider")) {
				Rider rider = riderService.selectRiderById(id, pwd);
				if (rider != null) {
					model.addAttribute("id", id);
					model.addAttribute("name", rider.getRider_name());
					return "rider/homePage";
				} else
					return "loginFail";
			}
		}
		return null;
	}
	
	@RequestMapping(value="quit")
	public String quit(){
		return "login";
	}

}
