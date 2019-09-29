package com.virtusa.models;

public class LpModel {

	private String lpId;
	private String password;
	public LpModel() {}
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LpModel [lpId=" + lpId + ", password=" + password + "]";
	}
	
}
