package com.riversoftit.string;
import static java.lang.Math.PI;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p=new String("CAR");
		System.out.println(p.hashCode());
		String p1="bike";
		System.out.println(p1.hashCode());
		StringBuffer s=new StringBuffer("vcjhgscnhua");
		System.out.println(s.length());
		System.out.println(s.reverse());
		StringBuilder s2=new StringBuilder("5271814771");
		System.out.println(s2.indexOf(p));
		System.out.println(s2.lastIndexOf(p));
		System.out.println(s2.reverse());
		
	    
}
}


