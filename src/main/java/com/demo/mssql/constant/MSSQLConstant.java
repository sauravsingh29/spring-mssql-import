package com.demo.mssql.constant;

public final class MSSQLConstant {
	public static final String GET_ALL_ROLE = "SELECT r.RoleName FROM dbo.Roles r";
	public static final String GET_ALL_USER = "SELECT u.UserName, u.LoginName, u.Designation FROM dbo.Users u";
	
	public static final class LoginName{
		public static final String TL_LOGIN_NAME = "TLambright";
		public static final String SF_LOGIN_NAME = "SFisher";
		public static final String YH_LOGIN_NAME = "YHuang";
	}
	
	public static final class Roles{
		public static final String ADMIN = "Admin";
		public static final String ANALYST = "Analyst";
		public static final String USER = "User";
		public static final String CUSTOMER_SUPPORT = "CustomerSupport";
	}
}
