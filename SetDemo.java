package com.collections;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hasSet=new HashSet<Student> ();
		Student s1=new Student(1,"abc");
		hasSet.add(s1);
		System.out.println(s1.hashCode());
		String s="java";
		System.out.println(s.hashCode());
		Student s2=new Student(1,"abc");
		hasSet.add(s2);
		System.out.println(s2.hashCode());
		HashSet<Integer> hasSet1=new HashSet<Integer> ();
		hasSet1.add(25);
		hasSet1.add(25);
		System.out.println(hasSet1);

	}
	

}
