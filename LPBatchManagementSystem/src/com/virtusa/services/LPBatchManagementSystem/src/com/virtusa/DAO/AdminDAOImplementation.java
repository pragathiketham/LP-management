package com.virtusa.DAO;

import java.util.List;



import com.virtusa.entities.Admin;
import com.virtusa.repository.AdminRepository;
import com.virtusa.utilities.Adminrequests;

public class AdminDAOImplementation implements AdminDAO {
	private List<Admin> adminList=null;
	
	public AdminDAOImplementation() {
		this.adminList=AdminRepository.getAdminRepository();

	}

	@Override
	public boolean adminAuth(String adminId, String password) {
		// TODO Auto-generated method stub
		
		boolean result=false;
for(Admin admin:adminList) {
			
			if(admin.getAdminId().equals(adminId)) {
				
				if(admin.getPassword().equals(password)) {
					result= true;
										
				}
				
			}
		}
		return result;
		
	}

	@Override
	public String retrieveAdmin(String adminId,String password) {
		// TODO Auto-generated method stub
		String returnAdminRequest=null;
		for(Admin admin:adminList) {
			if(admin.getAdminId().equals(adminId)){
				if(admin.getPassword().equals(password)) {
			Adminrequests adminRequest=admin.getAdminRequest();
			
			switch(adminRequest) {
			
			case ADMINID:
				returnAdminRequest="ADMINID";
				break;
				
			case PASSWORD:
				returnAdminRequest="PASSWORD";
				break;
			
			}
		}
		}
		}
		return returnAdminRequest;
	}
	}

	
	
		
	


