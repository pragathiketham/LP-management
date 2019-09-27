package com.virtusa.helper;

import com.virtusa.DAO.UserDAO;
import com.virtusa.DAO.UserDAOImplementation;
import com.virtusa.services.UserServiceImplementation;
import com.virtusa.services.UserServices;

public class UserFactory {

	public static UserDAO createUserDAO() {
		UserDAO userDAO=new UserDAOImplementation();
		return userDAO;
	}
	
	public static UserServices createUserService() {
		UserServices userService=new UserServiceImplementation();
		return userService;
	}
}
