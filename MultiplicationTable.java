package com.riversoftit;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number,i;
		Scanner sc = new Scanner(System.in);
		number=sc.nextFloat();
		System.out.println("Enter any table in a multiplication values");
		for(i=0;i<=15;i++) {
			System.out.println(number+"*"+i+"="+(number*i));
		
		
		}
		

	}

}
