package com.virtusa.DAO;

public interface AdminDAO {

	public boolean adminAuth(String adminId,String password);
	public String retrieveAdmin(String adminId,String password);
}
