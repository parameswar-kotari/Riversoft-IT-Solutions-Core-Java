package com.riversoftit.collections;

import java.util.Arrays;
import java.util.Collections;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(44, 55, 99, 77, 88, 66);  
		System.out.println("list before swapping"+list);
		Collections.swap(list, 2, 4);
		System.out.println("list after swapping"+list);
		

	}

}
