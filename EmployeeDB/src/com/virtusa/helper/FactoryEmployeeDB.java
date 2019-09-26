package com.virtusa.helper;

import com.virtusa.dao.EmployeesDAO;
import com.virtusa.dao.JDBCEmployeesDAOImpl;
import com.virtusa.service.EmployeesService;
import com.virtusa.service.EmployeesServiceImpl;

public class FactoryEmployeeDB{
	
	public static EmployeesDAO createEmployeesDAO(){
		EmployeesDAO employeesDAO=new JDBCEmployeesDAOImpl();
		return employeesDAO;
		
	}
	public static EmployeesService createEmployeesService(){
		EmployeesService employeesService=
				new EmployeesServiceImpl();
		return employeesService;
	}

}
