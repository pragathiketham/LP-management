package com.virtusa.view;

import java.util.List;

import com.virtusa.model.EmployeesModel;

public class EmployeeView {
	
	public void showDepartmentName(EmployeesModel models) {
		
		System.out.println("Deparment Name:"+models.getDepartmentsModel().getDepartmentName()+"\n");
	}
	
	public void showEmployeeName(List<EmployeesModel> models) {
		for(EmployeesModel model:models) {
			System.out.println(model.getFullName()+"\n");
		}
		
	}
	
	public void showEmployeeContact(List<EmployeesModel> models) {
		for(EmployeesModel model:models) {
			System.out.println(model.getContactDetails()+"\n");
		}
		
	}
	
	public void showEmployeeSalary(List<EmployeesModel> models) {
		for(EmployeesModel model:models) {
			System.out.println(model.getTotalSalary()+"\n");
		}
		
	}

}
