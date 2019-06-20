package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkkwm.dao.ShopDao;
import com.kkkwm.pojo.Shop;
import com.kkkwm.service.ShopService;

@Service("shopService")
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopDao shopDao;

	@Override
	public Shop getShopBySeller(String seller_id) {
		Shop shop = shopDao.getShop(seller_id);
		return shop;
	}

	@Override
	public String getShopID(String seller_id) {
		Shop shop = shopDao.getShop(seller_id);
		if(shop != null)
			return shop.getShop_id();
		else
		return null;
	}

	@Override
	public int insertShop(Shop shop) {
		int i = shopDao.insertShop(shop);
		return i;
	}

	@Override
	public List<Shop> getShop() {
		List<Shop> shop = shopDao.getShopAll();
		if(shop == null)
			return null;
		else return shop;
	}

	@Override
	public String getShopName(String shop_id) {
		Shop shop = shopDao.getShopByID(shop_id);
		if(shop != null)
			return shop.getShop_name();
		else
		return null;
	}

	@Override
	public Shop getShopById(String shop_id) {
		Shop shop = shopDao.getShopByID(shop_id);
		if(shop != null)
			return shop;
		else return null;
	}

}
