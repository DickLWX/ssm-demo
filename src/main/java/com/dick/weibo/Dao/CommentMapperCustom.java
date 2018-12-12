package com.dick.weibo.Dao;

import com.dick.weibo.po.CommentCustom;
import com.dick.weibo.po.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapperCustom {

	// 评论
	void addComment(CommentCustom commentCustom);

	// 查询weiboId的评论
	List<CommentCustom> queryComment(int weiboId);

	// 查询评论下回复数量
	int qeuryCountReply(Integer commentId);

	// 删除评论
	void deleteCommentById(int commentId);

	// 根据userID查询评论列表
	List<CommentCustom> queryCommentByUserId(Page<CommentCustom> page);

}