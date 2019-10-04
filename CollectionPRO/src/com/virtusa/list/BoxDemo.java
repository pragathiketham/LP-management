package com.virtusa.list;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Box<String>  boxString=new Box<>();
		boxString.setField("pragathi");
		//boxString.setField(10);//checked operation
		
		String field=boxString.getField();
		System.out.println(field);//safe operation
		
		Box<Integer>  boxInteger=new Box<>();
		boxInteger.setField(10);
		
		int i=boxInteger.getField();
		
	}

}
