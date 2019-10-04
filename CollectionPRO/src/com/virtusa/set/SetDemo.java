package com.virtusa.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> setInteger=new HashSet<>();
		System.out.println(setInteger.add(10));
		
		System.out.println(setInteger.add(20));
		
		System.out.println(setInteger.add(30));
		
		System.out.println(setInteger.add(10));
		
		System.out.println(setInteger);
		
		for(Integer o:setInteger) {
			System.out.println(o);
		}
		
		
		for(Iterator<Integer> iterator=setInteger.iterator();iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		//java 8
		setInteger.forEach((o)->{
			System.out.println(o);
		});
		
		//java 8
		setInteger.forEach(System.out::println);
		
		
	}

}
