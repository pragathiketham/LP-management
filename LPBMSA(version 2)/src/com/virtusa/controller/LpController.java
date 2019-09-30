package com.virtusa.controller;


import com.virtusa.helper.FactoryEmployeeDB;
import com.virtusa.service.LpService;
import com.virtusa.view.LpView;

public class LpController {

	private LpService lpService;
	LpView employeeView=new LpView();
	
	public LpController() {
		this.lpService=
				FactoryEmployeeDB.createEmployeesService();
	}
	
}
