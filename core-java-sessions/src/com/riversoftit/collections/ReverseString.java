package com.riversoftit.collections;

import java.lang.reflect.Array;

public class ReverseString {

	public static void main(String[] args) {
			int[] arr= new int[] {6,7,8,4,6,9};
			System.out.println("Orginal Array: ");
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
				
			}
			System.out.println("Reverse array: ");
		
			for(int i=arr.length-1;i>=0; i--) {
			System.out.print(arr[i]+ " ");
			
	}

}
}