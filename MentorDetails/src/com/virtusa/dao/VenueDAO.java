package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.model.VenueDetailsModel;

public interface VenueDAO {

	public List<VenueDetailsModel> getVenueDetails() throws ClassNotFoundException, SQLException;
}
