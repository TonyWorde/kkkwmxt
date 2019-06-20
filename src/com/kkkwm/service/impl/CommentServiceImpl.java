package com.kkkwm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkkwm.dao.CommentDao;
import com.kkkwm.pojo.Comment;
import com.kkkwm.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;

	@Override
	public int insertComment(Comment comment) {
		int i = commentDao.insertComment(comment);
		return i;
	}
	
	@Override
	public List<Comment> getUserComment(String user_id){
		List<Comment> comment = commentDao.getUserComment(user_id);
		if(comment == null)
			return null;
		else return comment;
	}

}