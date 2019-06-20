package com.kkkwm.service;

import java.util.List;

import com.kkkwm.pojo.Comment;

public interface CommentService {
	public int insertComment(Comment comment);
	public List<Comment> getUserComment(String user_id);
}
