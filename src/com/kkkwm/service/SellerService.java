package com.kkkwm.service;

import java.util.List;


import com.kkkwm.pojo.Seller;

public interface SellerService {
	
	public Seller selectSellerById(String se_id,String se_pwd);
	public List<Seller> allSeller();
	public int registSeller(Seller seller);
	public int deleteSeller(String seller_id);
	public Seller getSeller(String seller_id);
	public int updateSeller(Seller seller);

}
