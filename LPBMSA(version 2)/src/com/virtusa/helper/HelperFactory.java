package com.virtusa.helper;

import com.virtusa.dao.EmployeesDAO;
import com.virtusa.dao.JDBCEmployeesDAOImpl;
import com.virtusa.dao.LpDAO;
import com.virtusa.service.EmployeesService;
import com.virtusa.service.EmployeesServiceImpl;

public class HelperFactory {

	public static LpDAO createLpDAO(){
		LpDAO lpDAO=new JDBCEmployeesDAOImpl();
		return lpDAO;
		
	}
	public static EmployeesService createEmployeesService(){
		EmployeesService employeesService=new EmployeesServiceImpl();
		return employeesService;
}
