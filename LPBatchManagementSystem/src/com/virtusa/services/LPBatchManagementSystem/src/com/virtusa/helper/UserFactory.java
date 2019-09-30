package com.virtusa.helper;

import com.virtusa.DAO.AdminDAO;

import com.virtusa.DAO.AdminDAOImplementation;
import com.virtusa.DAO.LpDAO;
import com.virtusa.DAO.LpDAOImplementation;
import com.virtusa.DAO.MentorDAO;
import com.virtusa.DAO.MentorDAOImplementation;
import com.virtusa.services.AdminService;
import com.virtusa.services.AdminServiceImplementation;
import com.virtusa.services.LpServiceImplementation;
import com.virtusa.services.LpServices;
import com.virtusa.services.MentorService;
import com.virtusa.services.MentorServiceImplementation;

public class UserFactory {

	public static AdminDAO createAdminDAO() {
		AdminDAO adminDAO=new AdminDAOImplementation();
		return adminDAO;
	}
	
	public static AdminService createAdminService() {
		AdminService adminService=new AdminServiceImplementation();
		return adminService;
	}
	public static LpDAO createLpDAO() {
		LpDAO lpDAO=new LpDAOImplementation();
		return lpDAO;
	}
	
	public static LpServices createLpService() {
		LpServices lpService=new LpServiceImplementation();
		return lpService;
	}
	public static MentorDAO createMentorDAO() {
		MentorDAO mentorDAO=new MentorDAOImplementation();
		return mentorDAO;
	}
	
	public static MentorService createMentorService() {
		MentorService mentorService=new MentorServiceImplementation();
		return mentorService;
	}
	
	
	
	
	
}
