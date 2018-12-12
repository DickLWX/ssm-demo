package com.dick.weibo.Dao;

import com.dick.weibo.po.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapperCustom {

	List<Admin> queryAdminByUsername(Admin admin);
}