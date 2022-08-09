package com.riversoftit.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedLists=new LinkedList<>();
		linkedLists.add("ABC");
		linkedLists.add(null);
		linkedLists.add(null);
		linkedLists.add("DEF");
		linkedLists.addFirst("1st");
		linkedLists.addLast("last");
		linkedLists.set(2, "By using set");
		System.out.println(linkedLists);
		Iterator<?> iterator=linkedLists.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
