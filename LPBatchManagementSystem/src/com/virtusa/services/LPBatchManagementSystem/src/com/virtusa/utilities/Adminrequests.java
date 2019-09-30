package com.virtusa.utilities;

public enum Adminrequests {


	ADMINID("ADMINID"),PASSWORD("PASSWORD");
	
	private String val;
	private Adminrequests(String val) {
		this.val=val;
	}
	
	public String getVal() {
		return val;
	}	

}
