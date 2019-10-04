package com.virtusa.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorDemo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRollno(101);
		s1.setName("pragathi");
		s1.setMarks1(36);
		s1.setMarks2(45);
		s1.setMarks3(65);
		Student s2=new Student();
		s2.setRollno(102);
		s2.setName("pragu");
		s2.setMarks1(76);
		s2.setMarks2(49);
		s2.setMarks3(43);
		List<Student> studentList=new ArrayList();
		studentList.add(s1);
		studentList.add(s2);
		Collections.sort(studentList,new StudentComparatorByStudentrollno());
		for(Student student:studentList) {
			System.out.println(student);
		}
		
		}
		
	}
	

