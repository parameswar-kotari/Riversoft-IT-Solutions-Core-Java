package com.bhavisha;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	try {
	try {
		int arr[]= {1,2,3,4};
		System.out.println(arr[7]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("hai");
		System.out.println("hello");
		
	}
}
catch(ArrayIndexOutOfBoundsException e2) {
	System.out.println("hlo");
	System.out.println("iah");
}
}
catch( ArrayIndexOutOfBoundsException e3) {
	System.out.println("hooo");
	System.out.println("uuuuu");
	
	
}
catch(Exception e4) {
	System.out.println("yyge");
	System.out.println("gygyfy");
}

	}

}
