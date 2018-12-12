package com.dick.weibo.service;

import com.dick.weibo.po.CommentCustom;
import com.dick.weibo.po.Page;

import java.util.List;

public interface CommentService {

	// 评论
	void addComment(CommentCustom commentCustom) throws Exception;

	// 查询微博下的评论
	List<CommentCustom> queryComment(int weiboId) throws Exception;

	// 查询评论下回复数
	int qeuryCountReply(Integer commentId) throws Exception;

	// 根据id删除评论
	void deleteCommentById(int commentId) throws Exception;

	// 根据userID查询评论列表
	Page<CommentCustom> queryCommentByUserId(Integer userId, int pageNo);

}