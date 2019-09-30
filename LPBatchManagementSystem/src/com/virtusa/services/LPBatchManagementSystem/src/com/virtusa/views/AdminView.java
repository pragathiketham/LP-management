package com.virtusa.views;

import java.util.Scanner;

import com.virtusa.controller.AdminController;
import com.virtusa.exception.UserException;


public class AdminView {

	public void adminLogin()
	{
		try {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter AdminId");
		String adminId=scanner.next();
		
		System.out.println("enter password");
		String password=scanner.next();
		
		AdminController controller=new AdminController();
		controller.adminAuthentication(adminId, password);
		
		}catch(UserException e) {
			System.out.println("invalid userid or password");
		}
	}
}
