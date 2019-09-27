package com.virtusa.services;
import com.virtusa.DAO.UserDAO;
import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.models.UserModel;

public class UserServiceImplementation implements UserServices {

	private UserDAO userDAO=null;
	public UserServiceImplementation() {
		this.userDAO=UserFactory.createUserDAO();
	}
	@Override
	public String UserAuthentication(UserModel userModel) {
		// TODO Auto-generated method stub
		boolean validUser=
				userDAO.userAuth(userModel.getUserName(), userModel.getPassword());
		
		String userType=null;
		if(validUser)
		{
			userType=userDAO.retrieveUserType(userModel.getUserName());
		}
		else
		{
			throw new UserException(" invalid username or password");
		}
	
		
		return userType;
	
	}
	}

