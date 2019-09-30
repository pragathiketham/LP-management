package com.virtusa.services;

import com.virtusa.DAO.LpDAO;

import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.models.LpModel;

public class LpServiceImplementation implements LpServices {

	private LpDAO lpDAO=null;
	public LpServiceImplementation() {
		this.lpDAO=UserFactory.createLpDAO();
	}
	@Override
	public String lpAuthentication(LpModel lpModel) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


