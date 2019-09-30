package com.virtusa.models;

public class AdminModel {

	private String adminId;
	private String password;
	
	public AdminModel() {}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminModel [adminId=" + adminId + ", password=" + password + "]";
	}
	
	
}
