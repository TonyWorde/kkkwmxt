package com.kkkwm.service;

import java.util.List;

import com.kkkwm.pojo.Cart;

public interface CartService {
	public List<Cart> getCart(String user_id);
	public int insertCart(Cart cart);
	public int deleteCartUser(String user_id);
	public Cart getCartByID(String food_id, String shop_id);
	public int updateCart(Cart cart);
	public Cart getCartByCart(String cart_id);
	public int deleteCartByID(String cart_id);

}
