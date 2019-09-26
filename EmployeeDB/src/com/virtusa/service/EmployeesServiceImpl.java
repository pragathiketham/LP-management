package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.dao.EmployeesDAO;
import com.virtusa.entities.Departments;
import com.virtusa.entities.Employees;
import com.virtusa.helper.FactoryEmployeeDB;
import com.virtusa.model.DepartmentsModel;
import com.virtusa.model.EmployeesModel;

public class EmployeesServiceImpl implements EmployeesService {

	private EmployeesDAO employeesDAO;
	
	public EmployeesServiceImpl() {
		this.employeesDAO=FactoryEmployeeDB.createEmployeesDAO();
		
	}
	@Override
	public List<EmployeesModel> retrieveEmployees() {
		// TODO Auto-generated method stub
		List<EmployeesModel> employeesModelList=new ArrayList<>();
		try {
			List<Employees> employeesList=employeesDAO.getAllEmployees();
			for(Employees employees:employeesList) {
				
				EmployeesModel employeesModel=new EmployeesModel();
				employeesModel.setFullName(employees.getFirstName()+" "+employees.getLastName());
				employeesModel.setTotalSalary(employees.getSalary()+employees.getSalary()*employees.getCommissionPCT());				
				employeesModel.setContactDetails(employees.getPhoneNumber()+","+employees.getEmail());
				employeesModelList.add(employeesModel);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employeesModelList;
	}
	@Override
	public EmployeesModel retrieveDepartmentName(int employeeId) {
		// TODO Auto-generated method stub
		Employees employees=null;
		EmployeesModel employeesModel=new EmployeesModel();
		try {
			employees=employeesDAO.getDeparmentName(employeeId);
			Departments departments=employees.getDepartments();
			DepartmentsModel departmentModel=new DepartmentsModel();
			departmentModel.setDepartmentName(departments.getDepartmentName());
			employeesModel.setDepartmentsModel(departmentModel);
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeesModel;
	}

}
