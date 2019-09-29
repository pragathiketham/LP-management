package com.virtusa.controller;

import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.models.LpModel;
import com.virtusa.services.LpServices;
import com.virtusa.views.ErrorView;
import com.virtusa.views.LpView;

public class LpController {

	private LpServices lpService;
	public LpController() {
		this.lpService=UserFactory.createLpService();
		
	}
	
	public void lpAuthentication(String lpId,String password) {
		
       LpModel lpModel=new LpModel();
		lpModel.setLpId(lpId);
		lpModel.setPassword(password);
		try {
		String userType=
			lpService.lpAuthentication(lpModel);
		
		 if(userType.contentEquals("LP")) {
			LpView lpView=new LpView();
			lpView.lpLogin();
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		
		}catch(UserException e) {
			System.out.println("User Authentication failed.");
			
		}
		
	}

}
