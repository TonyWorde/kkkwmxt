package com.kkkwm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.Shop;

@Repository
public interface ShopDao {
	public int insertShop(Shop shop);
	public int deleteShop(String shop_id);
	public int deleteShopBySeller(String seller_id);
	public int updateShop(Shop shop);
	public Shop getShop(String seller_id);
	public Shop getShopByID(String shop_id);
	public List<Shop> getShopAll();

}
