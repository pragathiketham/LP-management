package com.virtusa.services;

import com.virtusa.DAO.MentorDAO;
import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.models.MentorModel;

public class MentorServiceImplementation implements MentorService {

	private MentorDAO mentorDAO=null;
	public MentorServiceImplementation() {
		this.mentorDAO=UserFactory.createMentorDAO();
	}
	@Override
	public String mentorAuthentication(MentorModel mentorModel) {
		// TODO Auto-generated method stub
		return null;
	}
}

	
