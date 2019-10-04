package com.virtusa.list;

import java.util.ArrayList;
import java.util.List;

public class CreateListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List arrayList=	new ArrayList();
	//object objectArray[]=new object[10];
	arrayList.add(10);//AutoBoxing
	arrayList.add(30);//AutoBoxing
	arrayList.add(20);//AutoBoxing
	arrayList.add(40);//AutoBoxing
	arrayList.add(50);//AutoBoxing
	arrayList.add(60);//AutoBoxing
	arrayList.add(70);//AutoBoxing
	arrayList.add(80);//AutoBoxing
	arrayList.add(90);//AutoBoxing
	arrayList.add(100);//AutoBoxing
	arrayList.add(101);//AutoBoxing
	arrayList.add(107);//AutoBoxing
	arrayList.add(105);//AutoBoxing
	
	System.out.println("size:"+arrayList.size());
	
	arrayList.remove(2);
	System.out.println("size:"+arrayList.size());
	
	
	List arrayListCustom=new ArrayList(4);
	
	System.out.println("size:"+arrayListCustom.size());
	arrayListCustom.add(10);
	arrayListCustom.add(20);
	arrayListCustom.add(30);
	arrayListCustom.add(40);
	
	System.out.println("size:"+arrayListCustom.size());
	arrayListCustom.add(50);
	}

}
