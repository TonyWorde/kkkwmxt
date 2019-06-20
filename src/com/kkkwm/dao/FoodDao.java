package com.kkkwm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.Food;

@Repository
public interface FoodDao {
	public int insertFood(Food food);
	public int deleteFoodById(String food_id);
	public int deleteFoodByShop(String shop_id);
	public int updateFood(String food_id);
	public Food getFood(@Param("food_id") String food_id, @Param("shop_id") String shop_id);
	public List<Food> getFoodAll(String shop_id);

}
