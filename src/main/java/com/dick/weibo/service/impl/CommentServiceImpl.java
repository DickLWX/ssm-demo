package com.dick.weibo.service.impl;

import com.dick.weibo.Dao.CommentMapperCustom;
import com.dick.weibo.po.CommentCustom;
import com.dick.weibo.po.Page;
import com.dick.weibo.service.CommentService;
import com.dick.weibo.utils.DateConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapperCustom commentMapperCustom;

	private DateConvert dateConvert;
	// 评论
	@Override
	public void addComment(CommentCustom commentCustom) throws Exception {
		commentMapperCustom.addComment(commentCustom);
	}

	// 根据weiboId查询评论
	@Override
	public List<CommentCustom> queryComment(int weiboId) throws Exception {
		return commentMapperCustom.queryComment(weiboId);
	}

	// 查询回复数
	@Override
	public int qeuryCountReply(Integer commentId) throws Exception {
		return commentMapperCustom.qeuryCountReply(commentId);
	}

	// 根据id删除微博
	@Override
	public void deleteCommentById(int commentId) throws Exception {
		commentMapperCustom.deleteCommentById(commentId);
	}

	// 根据userID查询评论列表
	@SuppressWarnings("static-access")
	@Override
	public Page<CommentCustom> queryCommentByUserId(Integer userId, int pageNo) {
		Page<CommentCustom> page = new Page<CommentCustom>();
		page.setPageSize(10);
		page.setPageNo(pageNo);
		page.getParams().put("userId", userId);
		List<CommentCustom> commentList = commentMapperCustom.queryCommentByUserId(page);
		for (CommentCustom comment : commentList) {
			comment.setTime(dateConvert.convert2s(comment.getCommentTime()));
		}
		page.setResults(commentList);
		return page;
	}

}
