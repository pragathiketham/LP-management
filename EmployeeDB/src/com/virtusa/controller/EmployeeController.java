package com.virtusa.controller;

import java.util.List;

import com.virtusa.entities.Employees;
import com.virtusa.helper.FactoryEmployeeDB;
import com.virtusa.helper.RequestType;
import com.virtusa.model.EmployeesModel;
import com.virtusa.service.EmployeesService;
import com.virtusa.view.EmployeeView;
import com.virtusa.view.MainView;

public class EmployeeController {
	
	private EmployeesService employeeService;
	
	public EmployeeController() {
		this.employeeService=
				FactoryEmployeeDB.createEmployeesService();
	}
	
	public void handleRetrieveEmployees(RequestType request) {
		
		EmployeeView employeeView=new EmployeeView();
		List<EmployeesModel> models=employeeService.retrieveEmployees();
		MainView mainView=new MainView();
		switch(request) {
		
		case NAME: employeeView.showEmployeeName(models);
		           mainView.viewEmployeeMenu();
			       break;
		case CONTACT:employeeView.showEmployeeContact(models);
		           mainView.viewEmployeeMenu();
			       break;
		case SALARY:employeeView.showEmployeeSalary(models);
	               mainView.viewEmployeeMenu();
			       break;
			
		default:
			      break;
		
		}
		
		
	}
	
	public void handleRetrieveDepartmentName(int employeeId) {
		EmployeesModel employees=employeeService.retrieveDepartmentName(employeeId);
		EmployeeView employeeView=new EmployeeView();
		employeeView.showDepartmentName(employees);
	}

}
