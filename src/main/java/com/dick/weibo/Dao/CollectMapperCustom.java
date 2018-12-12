package com.dick.weibo.Dao;

import com.dick.weibo.po.CollectCustom;
import com.dick.weibo.po.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectMapperCustom {

	// 收藏
	void collect(CollectCustom collection);

	// 取消收藏
	void uncollect(CollectCustom collection);

	// 该用户是否收藏
	List<CollectCustom> isCollect(CollectCustom collect);

	// 查询我的收藏列表
	List<CollectCustom> queryMyCollection(Page<CollectCustom> page);
}