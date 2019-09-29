package com.virtusa.controller;

import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.models.AdminModel;
import com.virtusa.services.AdminService;
import com.virtusa.views.AdminView;
import com.virtusa.views.ErrorView;

public class AdminController {

	private AdminService adminService;
	public AdminController() {
		this.adminService=UserFactory.createAdminService();
		
	}
	
	public void adminAuthentication(String adminId,String password) {
		
       AdminModel adminModel=new AdminModel();
		adminModel.setAdminId(adminId);
		adminModel.setPassword(password);
		try {
		String userType=
			adminService.adminAuthentication(adminModel);
		
		 if(userType.contentEquals(adminId)) 
		 {
			 
		 if(userType.contentEquals(password))
		 {
			AdminView adminView=new AdminView();
			adminView.adminLogin();
		 }
		 
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		
		}catch(UserException e) {
			System.out.println("User Authentication failed.");
			
		}
		
	}

}
