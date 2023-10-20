package com.bfpp.beans;

public class ConnectionManager {
	private String driverClass;
	private String username;
	private String password;
	private String url;
	
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "ConnectionManager [driverClass=" + driverClass + ", username=" + username + ", password=" + password
				+ ", url=" + url + "]";
	}
}
