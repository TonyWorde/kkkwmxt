package com.kkkwm.service;

import java.util.List;

import com.kkkwm.pojo.Shop;

public interface ShopService {
	public Shop getShopBySeller(String seller_id);
	public Shop getShopById(String shop_id);
	public String getShopID(String seller_id);
	public int insertShop(Shop shop);
	public List<Shop> getShop();
	public String getShopName(String shop_id);

}
