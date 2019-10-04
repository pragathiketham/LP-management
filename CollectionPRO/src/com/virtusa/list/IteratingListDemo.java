package com.virtusa.list;

import java.util.ArrayList;
import java.util.List;

public class IteratingListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List integerList=new ArrayList();
		
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		
	

		
		//before java 5
		
		for(int i=0;i<integerList.size();i++) {
			
			
			//after java5
			for(Object o:integerList) {
				System.out.println(o);
			}
			/*
			
			//ConcurrentModification Exception
			for(Object o:integerList) {
				System.out.println(o);
				integerList.remove(o);
			}*/
			
			//java 8 default method forEach
			
			integerList.forEach((n)->{
				
				System.out.println(n);
			});
			
			//java 8 default method forEach and Method reference
			
			
			
			integerList.forEach(System.out::println);
			}
			
		}
	}


