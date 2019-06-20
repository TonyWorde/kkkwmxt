package com.kkkwm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.Seller;

@Repository
public interface SellerDao {
	
	public int insertSeller(Seller seller);
	public int deleteSeller(String seller_id);
	public int updateSeller(Seller seller);
	public Seller getSeller(String seller_id);
	public List<Seller> getSellerAll();
	
}
