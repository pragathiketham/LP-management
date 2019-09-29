package com.virtusa.controller;

import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.models.MentorModel;
import com.virtusa.services.MentorService;
import com.virtusa.views.ErrorView;
import com.virtusa.views.MentorView;

public class MentorController {

	private MentorService mentorService;
	public MentorController() {
		this.mentorService=UserFactory.createMentorService();
		
	}
	
	public void mentorAuthentication(String mentorId,String password) {
		
       MentorModel mentorModel=new MentorModel();
		mentorModel.setMentorId(mentorId);
		mentorModel.setPassword(password);
		try {
		String userType=
			mentorService.mentorAuthentication(mentorModel);
		
		 if(userType.contentEquals("MENTOR")) {
			MentorView mentorView=new MentorView();
			mentorView.mentorLogin();
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		
		}catch(UserException e) {
			System.out.println("User Authentication failed.");
			
		}
		
	}

}
