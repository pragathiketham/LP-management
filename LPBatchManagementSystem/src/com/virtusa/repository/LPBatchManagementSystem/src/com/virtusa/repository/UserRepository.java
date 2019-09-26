package com.virtusa.repository;

import java.util.HashMap;

import java.util.Map;


public class UserRepository {
	
		public static Map<String,String> userRepository;
	public UserRepository(){
		userRepository=new HashMap<String,String>();
	}
	
	public void addPersonToRepository(String username,String password) {
		
	
	userRepository.put("pragathiketham","pragathi@123");
	userRepository.put("durgabhavani","durga@123");
	userRepository.put("chandhanapriya", "chandhana@123");
	userRepository.put("pavanibhasuthkar", "pavani@123");
	userRepository.put("suryavamshi","surya@123");
	
	
		}

	public static Map<String, String> getUserRepository() {
		return userRepository;
	}

	
	
		
	

}


