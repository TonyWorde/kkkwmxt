package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkkwm.dao.*;
import com.kkkwm.pojo.*;
import com.kkkwm.service.SellerService;

@Service
@Transactional
public class SellerServiceImpl implements SellerService{
	
	@Autowired
//	@Qualifier("sellerDao")
	private SellerDao sellerDao;
	@Autowired
	private ShopDao shopDao;
	@Autowired
	private OrderDao orderDao;
	
	

	@Override
	public Seller selectSellerById(String se_id, String se_pwd) {
		Seller seller = sellerDao.getSeller(se_id);
		
		if(seller==null){
			return null;
		}else{
			if(seller.getSeller_id().equals(se_id)&&seller.getSeller_pwd().equals(se_pwd))
				return seller;
			else
				return null;
		}
	}

	@Override
	public List<Seller> allSeller() {
		List<Seller> seller = sellerDao.getSellerAll();
		
		if(seller==null)
			return null;
		else
			return seller;
	
	}

	@Override
	public int registSeller(Seller seller) {
		Seller se = sellerDao.getSeller(seller.getSeller_id());
		if(se != null)
			return 0;
		else{
			int i = sellerDao.insertSeller(seller);
			if(i==0)
				return 0;
			else return 1;
		}
	}

	@Override
	public int deleteSeller(String seller_id) {
		int i = 0;
		int result = 0;
		Shop shop = shopDao.getShop(seller_id);
		if(shop == null){
			i = sellerDao.deleteSeller(seller_id);
			return i;
		}
		else
		{
			List<Order> order = orderDao.getOrderAllByShop(shop.getShop_id());
			if(order == null || order.isEmpty()){
				i = sellerDao.deleteSeller(seller_id);
				shopDao.deleteShopBySeller(seller_id);
				return i;
			}
			else//订单状态，默认0未付款，1已付款，2拒接单，3已接单，4可取货，5已送出，6已完成
			{
				for(Order list : order){
					if((list.getOrder_status()==1)||(list.getOrder_status()==3)
							||(list.getOrder_status()==4)||(list.getOrder_status()==5)){
						result = 10;
					}
				}
				if(result != 10){
					i = sellerDao.deleteSeller(seller_id);
					shopDao.deleteShopBySeller(seller_id);
					return i;
				}
				else
					return 0;
			}
		}
	}

	@Override
	public Seller getSeller(String seller_id) {
		Seller seller = sellerDao.getSeller(seller_id);
		if(seller==null)
			return null;
		else
			return seller;
	}

	@Override
	public int updateSeller(Seller seller) {
		int i = sellerDao.updateSeller(seller);
		
		return i;
	}

}
