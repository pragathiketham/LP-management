package com.virtusa.repository;

import java.util.ArrayList;

import java.util.List;

import com.virtusa.entities.Lp;


public class LpRepository {
	public static List<Lp> lpRepository=new ArrayList<Lp>();
	
	static {
	Lp lp4=new Lp();
	lp4.setUserName("pragathipendem");
	lp4.setPassword("pragathi@123");
	lp4.setFirstName("pragathi");
	lp4.setLastName("pendem");
	lp4.setEmailAddress("pendempragathi123@gmail.com");
	lp4.setPhoneNumber("9643552557");
	lp4.setDateOfBirth("24-12-1994");
	lp4.setLpId("L002");
	
	lpRepository.add(lp4);
}

	public static List<Lp> getLpRepository() {
		return lpRepository;
	}
	
}
