package com.riversoftit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>() {};
		list1.add("Jack");
		list1.add("Harish");
		list1.add("Anil");
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Jack");
		list.add("Harish");
		list.add("Anil");
		//System.out.println(list);
		
		//System.out.println(list.contains("Anil"));
		
		list.addAll(list1);
		list.remove(2);
		//System.out.println(list);
//Basic for loop		
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(i+" "+list.get(i));
//		}

//Enhanced for loop		

		for(String o :list)
			System.out.println(o);
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
	}

}
