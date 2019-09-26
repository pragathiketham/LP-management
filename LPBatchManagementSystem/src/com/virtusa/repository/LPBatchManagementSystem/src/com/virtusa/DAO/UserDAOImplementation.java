package com.virtusa.DAO;

import com.virtusa.entities.User;
import com.virtusa.utilties.UserTypes;

public class UserDAOImplementation implements UserDAO{


	

	@Override
	public boolean userAuth(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public String retrieveUserType(String userName) {
		// TODO Auto-generated method stub
		String returnUserType=null;
		for(User user:userList) {
			if(user.getUserName().equals(userName)){
			UserTypes userTypes=user.getUserType();
			
			switch(userTypes) {
			
			case STUDENT:
				returnUserType="STUDENT";
				break;
				
			case ADMIN:
				returnUserType="ADMIN";
				break;
			
			}
			
		}
		}
		return returnUserType;
	}

}
