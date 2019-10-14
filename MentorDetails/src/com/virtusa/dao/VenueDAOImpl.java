package com.virtusa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.VenueDetailsModel;

public class VenueDAOImpl implements VenueDAO {

	@Override
	public List<VenueDetailsModel> getVenueDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=
				statement.executeQuery("select vn.venue_id,vn.venue_name,vn.venue_capacity,vn.venue_location,bt.batch_name from venue vn left join batch bt ON vn.venue_id=vn.batch_id");
		List<VenueDetailsModel> venuedetailsList=new ArrayList<>();
		
		
		VenueDetailsModel venueDetails=new VenueDetailsModel();
		venueDetails.setVenueId(resultSet.getString("venue_id"));
		venueDetails.setVenueName(resultSet.getString("venue_name"));
		venueDetails.setVenueCapacity(resultSet.getString("venue_capacity"));
		venueDetails.setVenueLocation(resultSet.getString("venue_location"));
		
		venuedetailsList.add(venueDetails);
	
	
	ConnectionManager.closeConnection();
	return venuedetailsList;
		
	}

}
