package com.virtusa.service;

import java.util.List;

import com.virtusa.entities.Employees;
import com.virtusa.model.EmployeesModel;

public interface EmployeesService {
	
	public List<EmployeesModel> retrieveEmployees();
	public EmployeesModel retrieveDepartmentName(int employeeId);

}
