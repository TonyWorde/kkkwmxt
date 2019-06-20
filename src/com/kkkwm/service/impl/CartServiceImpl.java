package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkkwm.dao.CartDao;
import com.kkkwm.pojo.Cart;
import com.kkkwm.service.CartService;

@Service("cartService")
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartDao cartDao;

	@Override
	public List<Cart> getCart(String user_id) {
		List<Cart> cart = cartDao.getCartByUser(user_id);
		if(cart == null)
			return null;
		else return cart;
	}

	@Override
	public int insertCart(Cart cart) {
		int i = cartDao.insertCart(cart);
		return i;
	}

	@Override
	public int deleteCartUser(String user_id) {
		int i = cartDao.deleteCartByUser(user_id);
		return i;
	}

	@Override
	public Cart getCartByID(String food_id, String shop_id) {
		Cart cart = cartDao.getCartByID(food_id, shop_id);
		if(cart == null)
			return null;
		else return cart;
	}

	@Override
	public int updateCart(Cart cart) {
		int i = cartDao.updateCart(cart);
		return i;
	}

	@Override
	public Cart getCartByCart(String cart_id) {
		Cart cart = cartDao.getCart(cart_id);
		if(cart == null)
			return null;
		else return cart;
	}

	@Override
	public int deleteCartByID(String cart_id) {
		int i = cartDao.deleteCartByID(cart_id);
		return i;
	}

}
