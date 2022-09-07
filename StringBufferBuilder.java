package com.bhavisha;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("6553.757");
		
		System.out.println(str.hashCode());
		str="subbareddy";
		System.out.println(str.hashCode());
		String str1 = "subbareddy";
		System.out.println(str1.hashCode());
		String str2 = "SriHari";
		System.out.println(str2.hashCode());
		System.out.println(str.hashCode());
		
		
		System.out.println(str);
		StringBuilder s=new StringBuilder("gdcuksslitdguslgssfja");

		System.out.println(s.length());
		StringBuffer sn=new StringBuffer("1234567890");
				
System.out.println(sn.reverse());
	}

}
