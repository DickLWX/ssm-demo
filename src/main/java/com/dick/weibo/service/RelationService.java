package com.dick.weibo.service;

import com.dick.weibo.po.Relation;

import java.util.List;



public interface RelationService {

	// 查询相互关注
	public List<Relation> queryMutual(Relation relation) throws Exception;
	
	// 查询是否单方关注
	public List<Relation> queryUnilateral(Relation relation) throws Exception;
	
	//关注
	public void follow(Relation relation, int flag) throws Exception;

	//取关
	public void unfollow(Relation relation, int flag) throws Exception;

	//查询关系
	public int queryRelation(Integer userId, Integer followId) throws Exception;
	
}
