package com.dick.weibo.Dao;

import com.dick.weibo.po.User;
import com.dick.weibo.po.UserCustom;
import com.dick.weibo.po.UserVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapperCustom {

	// 用户登录
	public List<UserCustom> loginVerify(UserVo userVo) throws Exception;

	// public String loginVerify22(UserVo userVo) throws Exception;

	// 根据用户id查询用户信息
	public List<UserCustom> queryInfoByUserId(@Param("id")int id) throws Exception;

	// 修改用户id为userId的用户信息
	public void updateByUserId(UserVo userVo) throws Exception;

	// 查询用户发博数
	public int queryWeiboCount(@Param("id")int id) throws Exception;

	// 查询用户关注数
	public int queryFollowCount(@Param("id")Integer id) throws Exception;

	// 查询用户粉丝数
	public int queryFansCount(@Param("id")Integer id) throws Exception;

	// 根据用户username查询用户
	public List<UserCustom> queryByUsername(@Param("username") String username) throws Exception;

	//@Select("SELECT u.username FROM USER AS u WHERE username=#{username}")
	String testsql(@Param("username")String username);

	// 添加用户
	public void insertUser(User user) throws Exception;

	// 查询省市
	public String queryPC(@Param("id")String id) throws Exception;

	// 查询用户被转发量
	public int queryRepostCount(@Param("userId")Integer userId);

	// 查询用户被评论数量
	public int queryCommentCount(@Param("userId")Integer userId);

	// 查询用户被回复量
	public int queryReplyCount(@Param("userId")Integer userId);

	// 根据userId查询关注列表
	public List<UserCustom> queryFollowList(@Param("userId")int userId);

	// 根据userId查询粉丝列表
	public List<UserCustom> queryFansList(@Param("userId")Integer userId);

	// 修改密码
	public void updatePassword(User u);

	// 模糊查询用户
	public List<UserCustom> queryUserByWord(@Param("keyWord")String keyWord);


}