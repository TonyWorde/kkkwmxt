package com.kkkwm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kkkwm.pojo.Comment;


@Repository
public interface CommentDao {
	public int insertComment(Comment comment);
	public List<Comment> getUserComment(String user_id);
}
