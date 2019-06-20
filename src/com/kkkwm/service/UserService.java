package com.kkkwm.service;

import java.util.List;


import com.kkkwm.pojo.User;

public interface UserService {
	
	public User selectUserById(String user_id,String user_pwd);
	public List<User> allUser();
	public User getUser(String user_id);
	public int updateUser(User user);
	public int registUser(User user);

}
