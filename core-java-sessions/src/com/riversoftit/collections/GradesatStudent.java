package com.riversoftit.collections;

import java.util.Scanner;

public class GradesatStudent {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		System.out.println("enter the grade");
		char c=((str.nextLine()).charAt(0));
		if(c=='a') 
			System.out.println("Outstanding");
		else if(c=='b')
			System.out.println("Excellent");
		else if(c=='c')
			System.out.println("Good");
		else if(c=='d')
			System.out.println("Average");
		else if (c=='e')
		System.out.println("Satisfactory");
		else 
			System.out.println("fail");
		
		// TODO Auto-generated method stub

	}

}
