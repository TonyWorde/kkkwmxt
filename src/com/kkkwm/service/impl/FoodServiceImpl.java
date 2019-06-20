package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkkwm.dao.FoodDao;
import com.kkkwm.pojo.Food;
import com.kkkwm.service.FoodService;

@Service("foodService")
public class FoodServiceImpl implements FoodService{
	
	@Autowired
	private FoodDao foodDao;

	@Override
	public int insertFood(Food food) {
		Food fd = foodDao.getFood(food.getFood_id(), food.getShop_id());
		if(fd != null)
			return 0;
		else{
			int i = foodDao.insertFood(food);
			return i;
		}
		
	}

	@Override
	public List<Food> getFoodAll(String shop_id) {
		List<Food> food = foodDao.getFoodAll(shop_id);
		if(food == null)
			return null;
		else return food;
	}

	@Override
	public Food getFood(String food_id, String shop_id) {
		Food food = foodDao.getFood(food_id, shop_id);
		return food;
	}


}
