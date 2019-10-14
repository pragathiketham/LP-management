package com.virtusa.service;

import java.util.List;

import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.MentorDetailsModel;
import com.virtusa.model.VenueDetailsModel;

public interface MentorService {

	public List<MentorDetailsModel> getMentorDetails();

	public List<BatchDetailsModel> getBatchDetails();

	public int updatedmentordetails(String mentorid, String batchid);
	

}
