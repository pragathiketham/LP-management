package com.virtusa.repository;

import java.util.ArrayList
;
import java.util.List;
import com.virtusa.entities.Mentor;


public class MentorRepository {

	public static List<Mentor> mentorRepository=new ArrayList<Mentor>();
	static {
		
		Mentor mentor2=new Mentor();
		mentor2.setUserName("shruthi");
		mentor2.setPassword("arjula@123");
		mentor2.setFirstName("shruthi");
		mentor2.setLastName("arjula");
		mentor2.setEmailAddress("shruthi123@gmail.com");
		mentor2.setPhoneNumber("9894324556");
		mentor2.setDateOfBirth("14-08-1998");
		mentor2.setMentorId("M004");
		
		mentorRepository.add(mentor2);
		
		}
	public static List<Mentor> getMentorRepository() {
		return mentorRepository;
	}
	
}
