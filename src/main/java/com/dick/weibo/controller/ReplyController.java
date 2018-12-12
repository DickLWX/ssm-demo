package com.dick.weibo.controller;

import com.dick.weibo.po.ReplyCustom;
import com.dick.weibo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	
	//删除回复
	@RequestMapping(value="deleteReply")
	public void deleteReply(@RequestParam("replyId") int replyId) throws Exception {
		replyService.deleteReplyById(replyId);
	}
	
	//添加回复
	@RequestMapping(value="reply",method = RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public ReplyCustom reply(
			@RequestBody ReplyCustom replyCustom ) throws Exception {
		replyService.addReply(replyCustom);
		return replyCustom;
	}
	
	//查询回复
	@RequestMapping(value="queryReply", method = RequestMethod.GET)
	@ResponseBody
	public String queryReply(
			@RequestParam("commentId") int commentId) throws Exception {
		String json = null;
		replyService.queryReply(commentId);
		return json;
	}
	
}
