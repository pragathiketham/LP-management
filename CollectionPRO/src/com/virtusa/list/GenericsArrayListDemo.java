package com.virtusa.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsArrayListDemo {

	public static void main(String[] args) {
		
		
		List<Integer> integerList=new ArrayList<>();
		integerList.add(10);
		
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		
		for(Integer o:integerList) {
			System.out.println(o++);
		}
		System.out.println(integerList);
		
		for(Iterator<Integer> iterator=integerList.iterator();
				iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		List<Number> numberList=new ArrayList<>();
		numberList.add(34d);
		numberList.add(101L);
		numberList.add(34.5f);
		numberList.add(10);
	}
}
