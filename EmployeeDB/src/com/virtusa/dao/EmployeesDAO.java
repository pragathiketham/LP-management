package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Employees;

/**
 * 
 * @author admin
 * Declaration of data operations for business Entity Employees
 *
 */
public interface EmployeesDAO {
	
	public List<Employees> getAllEmployees()throws ClassNotFoundException, SQLException;
	public Employees getDeparmentName(int employeeId)throws ClassNotFoundException, SQLException;

}
