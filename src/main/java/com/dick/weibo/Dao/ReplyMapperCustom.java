package com.dick.weibo.Dao;

import com.dick.weibo.po.Page;
import com.dick.weibo.po.ReplyCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyMapperCustom {

	// 添加回复
	void addReply(ReplyCustom replyCustom);

	// 遍历回复
	List<ReplyCustom> queryReply(int commentId);

	// 删除回复
	void deleteReplyById(int replyId);

	// 根据userID查询回复列表
	List<ReplyCustom> queryReplyByUserId(Page<ReplyCustom> page);

}
