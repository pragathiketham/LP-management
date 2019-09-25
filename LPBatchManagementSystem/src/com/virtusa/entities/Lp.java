package com.virtusa.entities;

public class Lp extends User {
 
public Lp() {
		
	}
	private String lpId;
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	@Override
	public String toString() {
		return "lp [lpId:" + lpId + "]";
	}
	
	
}
