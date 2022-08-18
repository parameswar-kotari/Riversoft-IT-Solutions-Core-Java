package com.riversoftit;

public class SwappingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10, n2=20;
		System.out.println("Before swapping N1: " +n1 +" Before swapping N2: " +n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping N1: " +n1 +" After swapping N2: " +n2);

	}

}
