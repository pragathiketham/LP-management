package com.virtusa.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SortedSet<Integer>  sortedSet=new TreeSet<>();
		
		sortedSet.add(20);
		sortedSet.add(50);
		sortedSet.add(30);
		sortedSet.add(340);
		sortedSet.add(400);
		System.out.println(sortedSet);
		
		
		SortedSet<String> sortedSetString=new TreeSet<>();
		
		sortedSetString.add("chirag");
		sortedSetString.add("amit");
		sortedSetString.add("pragathi");
		sortedSetString.add("Pakshika");
		sortedSetString.add("Praveen");
		sortedSetString.add("sabbir");
		System.out.println(sortedSetString);
		
		
		
		
		
	}

}
