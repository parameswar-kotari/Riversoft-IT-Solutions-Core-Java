package com.riversoftit.collections;
import java. util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prop1=new int[] {2,10,5,41,6,7};
		System.out.println("The origrinal prop1 is:");
		for(int i=0;i<prop1.length;i++) {
			System.out.println(prop1[i]);
		
		System.out.println(" ");
		System.out.println("The reverse array is: ");
		for(int i=prop1.length-1;i>=0;--i) {
			System.out.println(prop1[i]);
		}
	}

}
}
