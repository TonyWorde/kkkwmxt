package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkkwm.dao.UserDao;
import com.kkkwm.pojo.User;
import com.kkkwm.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
//	@Qualifier("userDao")
	private UserDao userDao;

	@Override
	public User selectUserById(String user_id, String user_pwd) {
		User user = userDao.getUser(user_id);
		
		if(user==null){
			return null;
		}else{
			if(user.getUser_id().equals(user_id)&&user.getUser_pwd().equals(user_pwd))
				return user;
			else
				return null;
		}
	}

	@Override
	public List<User> allUser() {
		List<User> user = userDao.getUserAll();
		
		if(user==null)
			return null;
		else
			return user;
	}

	@Override
	public User getUser(String user_id) {
		User user = userDao.getUser(user_id);
		return user;
	}

	@Override
	public int updateUser(User user) {
		int i = userDao.updateUser(user);
		return i;
	}
	
	@Override
	public int registUser(User user) {
		User ur = userDao.getUser(user.getUser_id());
		if(ur != null)
			return 0;
		else{
			int i = userDao.insertUser(user);
			if(i==0)
				return 0;
			else return 1;
		}
		
	}

}
