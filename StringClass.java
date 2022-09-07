package com.packages;

public class StringClass {

	public static void main(String[] args) {
		
		String s1 = "java";
		s1.toUpperCase();
		System.out.println(s1);
		// TODO Auto-generated method stub
		
		
		StringBuffer sb1 = new StringBuffer("java is a ");
		sb1.append("Pogramming language");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("java is a ");
		System.out.println(sb2.capacity());
		sb2.append("Programming language");
		System.out.println(sb2.capacity());
	}

}
