package com.riversoftit.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("pooja");
		list.add("harish");
		list.add("amarnath");
		list.add(2, "subba reddy");
		System.out.println(list.contains("thika"));
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		
		
				

	}

}
