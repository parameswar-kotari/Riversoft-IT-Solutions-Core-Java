package com.riversoftit.collections;

import java.util.Scanner;

public class VowlesorConstants {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		System.out.print("Enter Character");
		char c=((str.nextLine()).charAt(0));
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		
			System.out.println("enter the letter is vowel");
			else
				System.out.println("enter the letter is consonent");
		// TODO Auto-generated method stub

	}

}
