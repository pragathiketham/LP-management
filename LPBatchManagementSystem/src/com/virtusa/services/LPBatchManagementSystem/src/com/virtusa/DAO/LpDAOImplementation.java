package com.virtusa.DAO;

import java.util.List;
import com.virtusa.entities.Lp;


public class LpDAOImplementation implements LpDAO {
	private List<Lp> lpList=null;

	@Override
	public boolean lpAuth(String lpId, String password) {
		// TODO Auto-generated method stub
		boolean result=false;
		
for(Lp lp:lpList) {
			
			if(lp.getLpId().equals(lpId)) {
				
				if(lp.getPassword().equals(password)) {
					result= true;
										
				}
				
			}
		}
		return result;

	}

	

	}


