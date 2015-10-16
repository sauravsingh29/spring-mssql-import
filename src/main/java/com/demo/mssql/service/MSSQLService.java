package com.demo.mssql.service;

import java.util.List;

import com.demo.mssql.model.MSSQLRole;
import com.demo.mssql.model.MSSQLUser;

public interface MSSQLService {
	public List<MSSQLRole> getAllRoles();
	
	public List<MSSQLUser> getAllUsers();
}
