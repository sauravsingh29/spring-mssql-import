package com.demo.mssql.dao;

import java.util.List;

import com.demo.mssql.model.MSSQLRole;
import com.demo.mssql.model.MSSQLUser;

public interface MSSQLDao {
	
	public List<MSSQLRole> getAllRoles(final String allRoleQuery);
	
	public List<MSSQLUser> getAllUsers(final String allUserQuery);
}
