package com.dick.weibo.controller;

import com.dick.weibo.po.CommentCustom;
import com.dick.weibo.service.CommentService;
import com.dick.weibo.utils.CacheUtil;
import com.dick.weibo.utils.DateConvert;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private static ObjectMapper MAPPER = new ObjectMapper();
	
	//添加评论
	@RequestMapping(value="comment",method = RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public CommentCustom comment(
			@RequestBody CommentCustom commentCustom) throws Exception {
		commentService.addComment(commentCustom);
		return commentCustom;
	/*	boolean b = CacheUtil.setString("123", "redis2");//向redis里存字符串 key-value
		System.out.println(b);//true成功，
		System.out.println(CacheUtil.getString("1234"));
		return null;*/
	}
	
	//遍历评论
	@RequestMapping(value="queryComment", method = RequestMethod.GET)
	@ResponseBody
	public String queryComment(
			HttpServletRequest request,
			@RequestParam("weiboId") int weiboId) throws Exception {
		
		List<CommentCustom> commentList = commentService.queryComment(weiboId);
		for (CommentCustom commentCustom : commentList) {
			commentCustom.setCountReply(commentService.qeuryCountReply(commentCustom.getCommentId()));
			commentCustom.setTime(DateConvert.convert2json(commentCustom.getCommentTime().getTime()));
		}
		String json = MAPPER.writeValueAsString(commentList);
		return json;
	}
	
	//删除评论
	@RequestMapping(value="deleteComment")
	public void deleteComment(@RequestParam("commentId") int commentId) throws Exception {
		commentService.deleteCommentById(commentId);
	}
}
