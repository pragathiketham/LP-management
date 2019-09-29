package com.virtusa.ui;

import java.util.Scanner;

import com.virtusa.views.AdminView;
import com.virtusa.views.ErrorView;
import com.virtusa.views.LpView;
import com.virtusa.views.MentorView;

public class ConsoleUi {

	public static void main(String[] args) {
		int role;
		AdminView adminview=new AdminView();
		LpView lpview=new LpView();
		MentorView mentorview=new MentorView();
		ErrorView errorview=new ErrorView();
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Admin");
		System.out.println("2.Mentor");
		System.out.println("3.Lp");
		role=scanner.nextInt();
		while(true) {
		try {
		switch(role)
		{
			case 1: adminview.adminLogin();
			break;
			
			case 2:lpview.lpLogin();
			break;
			
			case 3:mentorview.mentorLogin();
			break;
			
			default:
				System.out.println("enter valid number");
				break;
		}
		}catch(Exception e) {
			System.out.println("invalid number");
		}
			
		}
	}

}