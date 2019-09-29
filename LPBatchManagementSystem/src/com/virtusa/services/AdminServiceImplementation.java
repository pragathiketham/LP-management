package com.virtusa.services;

import com.virtusa.DAO.AdminDAO;
import com.virtusa.exception.UserException;
import com.virtusa.helper.UserFactory;
import com.virtusa.models.AdminModel;

public class AdminServiceImplementation implements AdminService {

	private AdminDAO adminDAO=null;
	public AdminServiceImplementation() {
		this.adminDAO=UserFactory.createAdminDAO();
	}
	@Override
	public String adminAuthentication(AdminModel adminModel) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
