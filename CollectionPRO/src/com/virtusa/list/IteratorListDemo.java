package com.virtusa.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List integerList=new ArrayList();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		
		Iterator iterator=integerList.iterator();
		
		while(iterator.hasNext()) {
			Object o=iterator.next();
			System.out.println(o);
			iterator.remove();//no concurrentModification exception
		}
		System.out.println(integerList);
		
		
		List stringList=new ArrayList();
		
		stringList.add("pragathi");
		stringList.add("pragu");
		stringList.add("pra");
		stringList.add("amit");
		stringList.add("praveen");
		
		
		ListIterator iteratorStringList=
		stringList.listIterator();
		
		
		while(iteratorStringList.hasNext()) {
			System.out.println(iteratorStringList.next());
		}
		
		System.out.println("**********");
		
		while(iteratorStringList.hasPrevious()) {
			System.out.println(iteratorStringList.previous());
		}
		
		
		
		//optimized code
		
		List floatList=new ArrayList();
 
		floatList.add(34.5f);
		floatList.add(14.5f);
		
		for(Iterator floatListIterator=floatList.iterator();
				floatListIterator.hasNext();
				) {
			System.out.println(floatListIterator.next());
		}
		
		
	}

}
