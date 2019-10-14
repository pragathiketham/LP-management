package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.BatchDetailsModel;
import com.virtusa.model.MentorDetailsModel;
import com.virtusa.model.VenueDetailsModel;

public interface MentorDAO {

	public List<MentorDetailsModel> getMentorDetails() throws SQLException, ClassNotFoundException;
	public List<BatchDetailsModel> getBatchDetails() throws ClassNotFoundException, SQLException;
	public int getUpdatedMentorDetails(String mentorid,String batchid) throws ClassNotFoundException, SQLException;
	
	
	
}
