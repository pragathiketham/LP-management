package com.virtusa.helper;

import com.virtusa.dao.MentorDAO;
import com.virtusa.dao.MentorDAOImpl;
import com.virtusa.dao.VenueDAO;
import com.virtusa.dao.VenueDAOImpl;
import com.virtusa.service.MentorService;
import com.virtusa.service.MentorServiceImpl;
import com.virtusa.service.VenueService;
import com.virtusa.service.VenueServiceImpl;

public class FactoryDB{
	
	public static MentorDAO createMentorDAO(){
		MentorDAO mentorDAO=new MentorDAOImpl();
		return mentorDAO;
	}
	

	public static MentorService createMentorService(){
		MentorService mentorservice=new MentorServiceImpl();
		return mentorservice;
		
		}
	
	public static VenueDAO createVenueDAO(){
		VenueDAO venueDAO=new VenueDAOImpl();
		return venueDAO;
	}
	
	public static VenueService createVenueService(){
		VenueService venueService=new VenueServiceImpl();
		return venueService;
		
		}
	
	
}
