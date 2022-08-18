package com.riversoftit.collections;

public class StringClass {

  public static void main(String[] args) {
	  String s1="Pooja";
	  String s2="Beautiful";
	  String s3="girl";
	  String s4="Girl";
	  String s5="beautiful";
	  char svr= s5.charAt(2);
	  System.out.println(s1.toUpperCase());
	  System.out.println(s2.toUpperCase());
	  System.out.println(s2.concat(s3));
	  System.out.println(s3.concat(s1));
	  System.out.println(s1.equals(s3));
	  System.out.println(s2.equalsIgnoreCase(s5));
	  System.out.println(s1.endsWith("a"));
	  System.out.println(s1.replaceAll(s4,s5));
	  System.out.println(svr);
	  System.out.println(s3.contains(s5));
	  System.out.println(s2.format(s3, args));
	  System.out.println(s2.getBytes());
	  System.out.println(s5.replace(svr, svr));
	  System.out.println(s4.split(s2));
	  System.out.println(s1.startsWith(s4, svr));
	  System.out.println(s5.substring(svr));
	  System.out.println(s2.valueOf(false));
	  System.out.println(s3.trim(s1));
}
}