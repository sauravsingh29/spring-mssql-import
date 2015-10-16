package com.demo.mssql.model;

public class MSSQLRole {
	private String roleName;

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MsSqlRole [roleName=");
		builder.append(roleName);
		builder.append("]");
		return builder.toString();
	}
	
}
