package com.kkkwm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.User;

@Repository
public interface UserDao {
	
	public int insertUser(User user);
	public int deleteUser(String user_id);
	public int updateUser(User user);
	public User getUser(String user_id);
	public List<User> getUserAll();

}
