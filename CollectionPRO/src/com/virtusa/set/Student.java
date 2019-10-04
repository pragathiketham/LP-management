package com.virtusa.set;

public class Student implements Comparable<Student> {

	
	private String name;
	private int rollno;
	private int marks1;
	private int marks2;
	private int marks3;
	public Student() {
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	@Override
	public String toString() {
		return "Student [student name=" + name + ", student rollno=" + rollno + ", marks1=" + marks1 + ", marks2=" + marks2
				+ ", marks3=" + marks3 + "]";
	}
	
public boolean equals(Object obj) {
		
		if(obj instanceof Student && obj!=null)
		{
			Student s2=(Student)obj;
			return this.name==s2.name;
		}
		return false;
	}
	
	public int hashCode()
	{
		return rollno;
		
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.rollno>o.rollno) {
			return 1;
		}
		else if(this.rollno<o.rollno) {
			return -1;
		}
		return 0;
	}
	
}
