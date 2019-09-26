package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.EmployeeController;
import com.virtusa.helper.RequestType;

public class MainView {
	
	public void mainMenu() {
		
		System.out.println("1. View Employee Details");
		System.out.println("2. View Employee Department");
		System.out.println("3. Register Employee");
		System.out.println("4. update Employee");
		System.out.println("5. Delete Employee");
		
		try(Scanner scanner=new Scanner(System.in);){
			
			System.out.print("Option:");
			int option=scanner.nextInt();
			
			switch(option) {
			
			case 1:viewEmployeeMenu();
			       break;
			case 2:
				viewEmployeeDepartmentName();
				   break;
			case 3:
				   break;
			case 4:
				   break;
			case 5:
				   break;
				  
			
			
			}
			
		}catch(Exception e) {
			
			
		}
		
	}
	
	public void viewEmployeeMenu() {
		
		try(
				Scanner scanner=new Scanner(System.in);
		){
			System.out.println("1. View Employees Name");
			System.out.println("2. View Employees Contact");
			System.out.println("3. View Employees Salary");
			System.out.println("4. Main Menu");
			
			System.out.print("Enter choice:");
			int option=scanner.nextInt();
			EmployeeController employeeController=new EmployeeController();
			if(option==1)
			employeeController.handleRetrieveEmployees(RequestType.NAME);
		
			if(option==2)
			employeeController.handleRetrieveEmployees(RequestType.CONTACT);
			
			if(option==3)
			employeeController.handleRetrieveEmployees(RequestType.SALARY);
			
            if(option==4)
            	mainMenu();
            

			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public void viewEmployeeDepartmentName() {
		  EmployeeController employeeController=new EmployeeController();
		  
		  try(Scanner scanner=new Scanner(System.in);){
			  System.out.print("Please Enter Employee Id:");
			  int employeeId=scanner.nextInt();
		employeeController.handleRetrieveDepartmentName(employeeId);
			  
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	       
		
	}
	}


