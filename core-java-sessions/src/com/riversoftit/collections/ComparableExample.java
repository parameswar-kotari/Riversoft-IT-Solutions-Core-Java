package com.riversoftit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student("ABC","XYZ",101,25));
		studentList.add(new Student("ABC","XYZ",120,25));
		studentList.add(new Student("ABC","XYZ",10,25));
		studentList.add(new Student("ABC","XYZ",1,25));
		studentList.add(new Student("ABC","XYZ",451,25));
		
		Collections.sort(studentList);
		System.out.println(studentList.toString());
	}

	

}
