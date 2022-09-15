package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array=new ArrayList<String>();
		array.add("happy");
		array.add("to");
		array.add("happy");
		array.add("see");
		System.out.println(array);
		Iterator itr=array.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
