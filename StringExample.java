package com.riversoftit;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a high level programming language";
		String str1=new String("independent platform");
		System.out.println(str1.toUpperCase());
		System.out.println(str.charAt(6));
		System.out.println(str1.compareTo(str));
       System.out.println(str.length());
        System.out.println(str.toLowerCase());
       System.out.println(str.concat(str1));
       System.out.println(str.endsWith(str1));
	}

}
