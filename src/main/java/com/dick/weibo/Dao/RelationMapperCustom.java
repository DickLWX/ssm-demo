package com.dick.weibo.Dao;

import com.dick.weibo.po.Relation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationMapperCustom {


	// 查询相互关注
	public List<Relation> queryMutual(Relation relation);

	//查询单方关注
	public List<Relation> queryUnilateral(Relation relation);

	// 关注
	public void Follow(Relation relation);

	// 改变关注状态
	public void Status(Relation r);

	// 取关
	public void UnFollow(Relation relation);

}
