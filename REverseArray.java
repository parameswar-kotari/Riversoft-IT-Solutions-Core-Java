package com.riversoftit;

public class REverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1=new int[] {8,  7,   6,  5  };
		System.out.println("The original array is: ");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]);
			
		}
		System.out.println("  ");
		System.out.println("The reverse array is: ");
		for(int i=array1.length-1;i>=0;--i) {
			
			System.out.print(array1[i]);
			
		}

	}

}
