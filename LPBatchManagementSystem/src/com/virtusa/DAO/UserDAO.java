package com.virtusa.DAO;

public interface UserDAO {

	public boolean userAuth(String userName,String password);
	public String retrieveUserType(String userName);
}
