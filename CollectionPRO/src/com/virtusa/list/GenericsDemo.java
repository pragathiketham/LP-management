package com.virtusa.list;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	
	public static void main(String[] args) {
		
		//before java 5
		
		//developer creates a list
		
		//unchecked
		List heteroList=new ArrayList();
		heteroList.add("pragathi");
		
		heteroList.add(12);
		heteroList.add(23.5f);
		
		//another developer will iterate the list
		//unsafe can result into ClassCastException
		for(Object o:heteroList) {
			if(o instanceof String) {
			String strObj=(String)o;
			System.out.println(strObj);
		}
			if(o instanceof Integer) {
				Integer intrObj=(Integer)o;
				System.out.println(intrObj);
			}
			if(o instanceof Float) {
				Float ftrObj=(Float)o;
				System.out.println(ftrObj);
			}
			
		}
	}

}
