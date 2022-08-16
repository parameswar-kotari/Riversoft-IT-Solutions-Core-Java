package com.riversoftit.collections;
import java.util.*;

public class Studentgrade {
	public static void main(String[]args) {
		Scanner pvr=new Scanner(System.in);
		System.out.println("enter the student grade");
		char c=((pvr.nextLine()).charAt(0));
		if
		(c=='A');
		System.out.println("Outstanding");
		
		if (c=='B')
			System.out.println("Exlent");
		else if (c=='C')
			System.out.println("Good");
		else if (c=='D')
			System.out.println("Average");
		else if(c=='E')
			System.out.println("Satisfactory");
		else if (c=='F')
			System.out.println("Fail");
	}

}
