package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sorted=new TreeSet<>();
		sorted.add("hammer");
		sorted.add("animal");
		sorted.add("fish");
		sorted.add("animal");
	
System.out.println(sorted);
sorted.remove("fish");
System.out.println(sorted);

		

	}

}
