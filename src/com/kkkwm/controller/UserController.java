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

import com.kkkwm.pojo.*;
import com.kkkwm.service.*;


@Controller
public class UserController 
{
	@Autowired
//	@Qualifier("userService")
	private UserService userService;
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("toUserHomePage")
	public String toHomePage(){
		return "user/homePage";
	}
	
	@RequestMapping("getAllUser")
	public ModelAndView getAllUser(ModelAndView mv){
		
		List<User> user = userService.allUser();
		mv.addObject("userlist", user);
		mv.setViewName("admin/getAllUser");
		return  mv;
	}
	
	@RequestMapping("userManageInUser")
	public ModelAndView userManage(ModelAndView mv, HttpSession session){
		String user_id = (String) session.getAttribute("id");
		User user = userService.getUser(user_id);
		mv.addObject("user", user);
		mv.setViewName("user/userManage");
		return mv;
	}
	
	@RequestMapping(value="toUpdateUser", method=RequestMethod.GET)
	public String toUpdateUser(User user, Model model){
		model.addAttribute("user", user);
		return "user/updateUser";
	}
	
	@RequestMapping(value="updateUser", method=RequestMethod.POST)
	public String updateUser(HttpSession session, @Valid User user, BindingResult result){
		String user_id = (String) session.getAttribute("id");
		User us = userService.getUser(user_id);
		
		if(result.hasErrors())
			return "user/updateUser";
		else{
			us.setUser_pwd(user.getUser_pwd());
			us.setUser_name(user.getUser_name());
			us.setUser_sex(user.getUser_sex());
			us.setUser_phone(user.getUser_phone());
			
			int i = userService.updateUser(us);
			if(i == 0)
				return "user/updateFail";
			else return "user/updateSuccess";
		}
	}
	
	
	@RequestMapping("toDeposit")
	public String toDeposit(){
		return "user/deposit";
	}
	
	@RequestMapping(value="deposit")
	public String deposit(HttpSession session, @RequestParam double balance){
		String user_id = (String) session.getAttribute("id");
		User user = userService.getUser(user_id);
		user.setUser_balabce(user.getUser_balance() + balance);
		userService.updateUser(user);
		return "user/depositSuccess";
	}
	
	@RequestMapping(value="toAddComment", method=RequestMethod.GET)
	public String toAddComment(){
		return "user/comment";
	}
	
	@RequestMapping(value="AddComment",method=RequestMethod.POST)
	public String AddComment(HttpSession session, String comment_content){
			String user_id = (String) session.getAttribute("id");

			Comment comment = new Comment();
			comment.setComment_content(comment_content);
			comment.setUser_id(user_id);
			int i = commentService.insertComment(comment);
			if(i == 0)
				return "user/submitFail";
			else return "user/submitSuccess";
		}
	
	@RequestMapping(value="getUserComment", method=RequestMethod.GET)
	public ModelAndView getUserComment(HttpSession session, ModelAndView mv){
		String user_id = (String) session.getAttribute("id");
		List<Comment> comment= commentService.getUserComment(user_id);
		mv.addObject("usercomment", comment);
		mv.setViewName("user/getComment");

		return mv;
	}
	
	

}
