package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.MentorDAO;
import com.virtusa.dao.VenueDAO;
import com.virtusa.helper.FactoryDB;
import com.virtusa.model.VenueDetailsModel;

public class VenueServiceImpl implements VenueService {
	
	private VenueDAO venueDAO;

	public VenueServiceImpl() {
		this.venueDAO = FactoryDB.createVenueDAO();

	}
	@Override
	public List<VenueDetailsModel> getVenueDetails() {
		// TODO Auto-generated method stub
		
		List<VenueDetailsModel> venueDetailsModellist = new ArrayList<VenueDetailsModel>();

		try {
			venueDetailsModellist = venueDAO.getVenueDetails();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return venueDetailsModellist;
		
	}

}
