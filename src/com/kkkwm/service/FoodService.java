package com.kkkwm.service;

import java.util.List;

import com.kkkwm.pojo.Food;

public interface FoodService {
	
	public int insertFood(Food food);
	public List<Food> getFoodAll(String shop_id);
	public Food getFood(String food_id, String shop_id);


}
