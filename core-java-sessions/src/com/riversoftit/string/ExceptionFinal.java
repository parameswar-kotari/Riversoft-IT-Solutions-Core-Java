package com.riversoftit.string;

public class ExceptionFinal {
 public static void main(String[]args) {
	 int i[]=new int[5];
	 i[8]=64;
	 try {
		System.out.println("the array is"+i[8]);
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("this is a car");
		 System.out.println("Exception thrown :"+e);
	 }
 }
}
