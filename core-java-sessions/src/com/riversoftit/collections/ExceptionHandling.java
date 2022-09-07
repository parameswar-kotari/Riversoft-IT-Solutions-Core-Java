package com.riversoftit.collections;

//public class ExceptionHandling{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			int a,b,c;
//			a=8;
//			b=0;
//			try {
//		    c=a/b;
//		    System.out.println(c);
//			}
//			catch(Exception pr) {
//				System.out.println(pr.getMessage());
//				
//			}
//			finally {
//				System.out.println("bangloor");
//				System.out.println("kuppam");
//			}
//	}
//}
//	Class
//	ExceptionThrown
	public Class ExceptionHandling{
		static int divideByZero(int a, int b)
		{
			int i=a/b;
			return i;
		}
	
	static int computeDivision(int a, int b)
	{
		int str=0;
		try {
			str=divideByZero(a,b);
		}
		catch (NumberFormateException tr) {
			System.out.println("NumberFormateException is occured");
		}
		return str;
	}
	public static void main(String args[]) {
		int a=8;
		int b=0;
		try {
			int i= computeDivision(a,b);
		}
		catch (ArithmaticException tr) {
			System.out.println(tr.getMessage());
			}
		}
	}
	
		