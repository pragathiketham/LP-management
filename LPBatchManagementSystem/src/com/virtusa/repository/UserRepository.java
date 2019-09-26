package com.virtusa.repository;


import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Admin;
import com.virtusa.entities.Lp;
import com.virtusa.entities.Mentor;
import com.virtusa.entities.User;
import com.virtusa.utilities.UserTypes;

public class UserRepository {
	private static List<User> userRepository=
			new ArrayList<User>();
	static{
		
		Lp lp1=new Lp();
		lp1.setUserName("pragathiketham");
		lp1.setPassword("pragathi@123");
		lp1.setFirstName("pragathi");
		lp1.setLastName("ketham");
		lp1.setEmailAddress("kethampragathi123@gmail.com");
		lp1.setPhoneNumber("9892956236");
		lp1.setDateOfBirth("01-10-1996");
		lp1.setLpId("L001");
		
		lp1.setUserType(UserTypes.LP);
		userRepository.add(lp1);
		
		Lp lp2=new Lp();
		lp2.setUserName("pakshikaketham");
		lp2.setPassword("pakshika@123");
		lp2.setFirstName("pakshika");
		lp2.setLastName("ketham");
		lp2.setEmailAddress("kethampakshika123@gmail.com");
		lp2.setPhoneNumber("9864532667");
		lp2.setDateOfBirth("05-10-1996");
		lp2.setLpId("L002");
		
		
		lp2.setUserType(UserTypes.LP);
		userRepository.add(lp2);
		
		Lp lp3=new Lp();
		lp3.setUserName("chonithkoduri");
		lp3.setPassword("chonith@123");
		lp3.setFirstName("chonith");
		lp3.setLastName("koduri");
		lp3.setEmailAddress("kodurichonith1998@gmail.com");
		lp3.setPhoneNumber("9705432167");
		lp3.setDateOfBirth("01-9-1996");
		lp3.setLpId("L003");
	
		lp3.setUserType(UserTypes.LP);
		userRepository.add(lp3);
		
		Admin admin=new Admin();
		admin.setUserName("saikirankoduri");
		admin.setPassword("saikirankoduri@123");
		admin.setFirstName("saikiran");
		admin.setLastName("koduri");
		admin.setEmailAddress("kodurisai1998@gmail.com");
		admin.setPhoneNumber("9742552775");
		admin.setDateOfBirth("01-9-2000");
	    admin.setAdminId("A003");
	    
	    admin.setUserType(UserTypes.LP);
		userRepository.add(admin);
	    
	    
	    Mentor mentor =new Mentor();
	    mentor.setUserName("dhanalaxmichinnamsetti");
		mentor.setPassword("chinnamsetti@123");
		mentor.setFirstName("dhanalaxmi");
		mentor.setLastName("chinnamsetti");
		mentor.setEmailAddress("dhanachinnamsetti1998@gmail.com");
		mentor.setPhoneNumber("9962264626");
		mentor.setDateOfBirth("01-3-1998");
		mentor.setMentorId("M003");
		
		 mentor.setUserType(UserTypes.LP);
			userRepository.add(mentor);
		   }
	public static List<User> getUserRepository() {
		return userRepository;
	}
}