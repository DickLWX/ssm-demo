package com.dick.weibo.service;



import com.dick.weibo.po.Admin;

import java.util.List;

public interface AdminService {

	List<Admin> queryAdminByUsername(Admin admin);

}
