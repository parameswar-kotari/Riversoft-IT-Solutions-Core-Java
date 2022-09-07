package com.bhavisha;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String();
		str="sai";
		System.out.println(str.hashCode());
		str="gttyhyg";
		System.out.println(str.hashCode());
		
		
		System.out.println(str);
		StringBuilder s=new StringBuilder("abcdefgh");

		System.out.println(s.length());
		StringBuffer sn=new StringBuffer("mutable");
				
System.out.println(sn.reverse());
	}

}
