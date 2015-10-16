package com.demo.mssql.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.demo.mssql.model.MSSQLRole;
import com.demo.mssql.model.MSSQLUser;

@Component("msSQLDao")
public class MSSQLDaoImpl implements MSSQLDao {

	private static final Logger logger = LoggerFactory.getLogger(MSSQLDao.class);
	@Autowired
	@Qualifier("dataSource")
	private BasicDataSource basicDataSource;

	@Override
	public List<MSSQLRole> getAllRoles(final String allRoleQuery) {
		logger.info("Calling data access object method [ {} ] to get all User Roles.", "getAllRoles");
		final List<MSSQLRole> msSqlRoles = new ArrayList<MSSQLRole>(0);
		new JdbcTemplate(basicDataSource).query(allRoleQuery, new ResultSetExtractor<MSSQLRole>() {

			@Override
			public MSSQLRole extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					MSSQLRole msSqlRole = new MSSQLRole();
					msSqlRole.setRoleName(
							StringUtils.isNotBlank(rs.getString(1)) ? rs.getString(1).trim() : rs.getString(1));
					msSqlRoles.add(msSqlRole);
				}
				return null;
			}
		});
		logger.info("Finished data access object method [ {} ] to get all User Roles.", "getAllRoles");
		return msSqlRoles;
	}

	@Override
	public List<MSSQLUser> getAllUsers(final String allUserQuery) {
		logger.info("Calling data access object method [ {} ] to get all Users.", "getAllUsers");
		final List<MSSQLUser> msSqlUsers = new ArrayList<MSSQLUser>(0);
		new JdbcTemplate(basicDataSource).query(allUserQuery, new ResultSetExtractor<MSSQLUser>() {

			@Override
			public MSSQLUser extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					MSSQLUser msSqlUser = new MSSQLUser();
					msSqlUser.setUserName(
							StringUtils.isNotBlank(rs.getString(1)) ? rs.getString(1).trim() : rs.getString(1));
					msSqlUser.setLoginName(
							StringUtils.isNotBlank(rs.getString(2)) ? rs.getString(2).trim() : rs.getString(2));
					msSqlUser.setDesignation(
							StringUtils.isNotBlank(rs.getString(3)) ? rs.getString(3).trim() : rs.getString(3));
					msSqlUsers.add(msSqlUser);
				}
				return null;
			}
		});
		logger.info("Finished data access object method [ {} ] to get all Users.", "getAllUsers");
		return msSqlUsers;
	}

}
