package com.virtusa.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	
	public static void main(String[] args) {
		
		
		Map<Integer,String> mapString=new HashMap<>();
		System.out.println(mapString.put(1, "sakshi"));
		System.out.println(mapString.put(2, "pakshika"));
		System.out.println(mapString.put(3, "sakshika"));
		System.out.println(mapString.put(1, "pakshi"));
		
		System.out.println(mapString);
		
		Set<Entry<Integer,String>> entries=
				mapString.entrySet();
		
		Iterator<Entry<Integer,String>> iterator=
				entries.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer,String> entry=iterator.next();
			if(entry.getKey()==2)
				System.out.println(entry.getValue());
		}
		
		//java 8
		mapString.forEach((k,v)->{
			System.out.println("key:"+k);
			System.out.println("Value:"+v);
		});
		
		Map<Integer,Employees> mapEmployees=new HashMap<>();
		
		
	}
}
