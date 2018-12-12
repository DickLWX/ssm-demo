package com.dick.weibo.service.impl;

import com.dick.weibo.Dao.AdminMapperCustom;
import com.dick.weibo.po.Admin;
import com.dick.weibo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapperCustom adminMapperCustom;
	
	@Override
	public List<Admin> queryAdminByUsername(Admin admin) {
		return adminMapperCustom.queryAdminByUsername(admin);
	}

}
