package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> hashset=new HashSet<>();
		Student obj4=new Student(6567,"yesg","bnglr",544355); 
		hashset.add(obj4);
		System.out.println(obj4.hashCode());
		System.out.println(obj4);
		Student obj5=new Student(6567,"yesg","fuyut",544355);
		hashset.add(obj5);
		System.out.println(hashset.size());
		


}
	}
