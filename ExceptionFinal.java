package com.bhavisha;

public class ExceptionFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= new int[7];
		 i[5]=87;
		try
		{
			System.out.println("the array is "+i[5]);
		}
		
catch( ArrayIndexOutOfBoundsException e)
		{
	System.out.println("i am good");
	System.out.println("Exception thrown  :" + e);
		}
	}

}
