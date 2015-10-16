package com.demo.mssql.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.demo.mssql.constant.MSSQLConstant;
import com.demo.mssql.dao.MSSQLDao;
import com.demo.mssql.model.MSSQLRole;
import com.demo.mssql.model.MSSQLUser;

@Service("msSQLService")
public class MSSQLServiceImpl implements MSSQLService {
	private static final Logger logger = LoggerFactory.getLogger(MSSQLService.class);

	@Autowired
	@Qualifier("msSQLDao")
	private MSSQLDao msSQLDao;

	@Override
	public List<MSSQLRole> getAllRoles() {
		logger.info("Calling service method [ {} ] to get all User Roles.", "getAllRoles");
		List<MSSQLRole> roles = msSQLDao.getAllRoles(MSSQLConstant.GET_ALL_ROLE);
		if (CollectionUtils.isEmpty(roles)) {
			logger.info("There is no user role data found.");
		} else {
			logger.info("There are total [ {} ] user role found", roles.size());
		}
		return roles;
	}

	@Override
	public List<MSSQLUser> getAllUsers() {
		logger.info("Calling service method [ {} ] to get all User Roles.", "getAllRoles");
		List<MSSQLUser> users = msSQLDao.getAllUsers(MSSQLConstant.GET_ALL_USER);
		if (CollectionUtils.isEmpty(users)) {
			logger.info("There is no user role data found.");
		} else {
			logger.info("There are total [ {} ] user found", users.size());
		}
		return users;
	}

}
