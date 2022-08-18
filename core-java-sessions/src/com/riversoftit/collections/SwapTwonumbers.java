package com.riversoftit.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = Arrays.asList(25,50,41,80,56,12);
			System.out.println("list before swaping"+list);
			Collections.swap(list, 5, 2);
			System.out.println("list after swapping"+list);
		
	}

}
