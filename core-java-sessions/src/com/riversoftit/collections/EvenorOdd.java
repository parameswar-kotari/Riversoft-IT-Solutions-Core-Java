package com.riversoftit.collections;
import java.util.*;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		System.out.print("Enter a number:");
		int num =reader.nextInt();
		if(num %2 == 0)
			System.out.print(num +"is even");
		else
			System.out.print(num+"is odd");
			
		// TODO Auto-generated method stub

	}

}
