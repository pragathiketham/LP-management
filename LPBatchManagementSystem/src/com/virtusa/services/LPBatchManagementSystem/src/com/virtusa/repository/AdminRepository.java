package com.virtusa.repository;

import java.util.ArrayList
;
import java.util.List;

import com.virtusa.entities.Admin;
public class AdminRepository {

	private static List<Admin> adminRepository=
			new ArrayList<Admin>();
	static {
		Admin admin1=new Admin();
		admin1.setUserName("sulochanaketham");
		admin1.setPassword("sulochana@123");
		admin1.setFirstName("sulochana");
		admin1.setLastName("ketham");
		admin1.setEmailAddress("kethamsulochana123@gmail.com");
		admin1.setPhoneNumber("9703425673");
		admin1.setDateOfBirth("01-07-1998");
		admin1.setAdminId("A002");
		adminRepository.add(admin1);
		
	}
	public static List<Admin> getAdminRepository() {
		return adminRepository;
	}
	
}
