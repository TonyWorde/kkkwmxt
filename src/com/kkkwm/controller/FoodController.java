package com.kkkwm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kkkwm.pojo.Food;
import com.kkkwm.service.*;

@Controller
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping("toAddFood")
	public String toAddFood(){
		return "seller/addFood";
	}
	
	@RequestMapping(value="addFood", method=RequestMethod.POST)
	public String addFood(HttpServletRequest request, @RequestParam(value="food_img",required=false) MultipartFile food_img,
			String food_id, String food_name, double food_price, HttpSession session) throws IOException
	{
		String imgPath = null;
		if(food_img != null && !food_img.isEmpty())
		{
//			String imgName = food_img.getOriginalFilename();
			String imgName = UUID.randomUUID().toString().replace("-", "");
//			String extName = food_img.getContentType();
			String imgUrl = request.getSession().getServletContext().getRealPath("/static/upload/");
//			File filePath = new File(imgUrl + File.separator + imgName);
			File filePath = new File(imgUrl +File.separator + imgName + ".jpg");
			if(!filePath.getParentFile().exists())
				filePath.getParentFile().mkdirs();
			food_img.transferTo(filePath);
			imgPath = "static/upload/" + imgName + ".jpg";
//			imgPath = "static/upload/" + imgName + "." + extName;
			
			String shop_id = shopService.getShopID((String)session.getAttribute("id"));
			if(shop_id == null)
				return "seller/addFoodFail";
			else{
				Food food = new Food();
				food.setFood_id(food_id);
				food.setFood_name(food_name);
				food.setFood_price(food_price);
				food.setShop_id(shop_id);
				food.setFood_img(imgPath);
				int i = foodService.insertFood(food);
				if(i == 0)
					return "seller/addFoodFail";
				else return "seller/addFoodSuccess";
			}
		}
		else return "seller/addFoodFail";
	}
	
	@RequestMapping("foodManage")
	public ModelAndView getFoodAll(ModelAndView mv, @RequestParam(value="shop_id", required=false) 
	String shop_id){
		
		List<Food> food = foodService.getFoodAll(shop_id);
		mv.addObject("foodlist", food);
		mv.setViewName("seller/foodManage");
		return mv;
	}
	
	@RequestMapping(value="showFood", method=RequestMethod.GET)
	public ModelAndView showFood(ModelAndView mv, @RequestParam String shop_id){
		List<Food> food = foodService.getFoodAll(shop_id);
		mv.addObject("foodlist", food);
		mv.setViewName("user/showFood");
		return mv;
	}

}
