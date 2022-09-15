package com.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,String> tree=new Hashtable<>();
		Map<Integer, String> map;
		tree.put(3,"test");
		tree.put(87,"power");
		tree.put(98,"pots");
		for(Map.Entry<Integer,String> entry:tree.entrySet()) {
			System.out.println("key="+entry.getKey()+" "+"value="+entry.getValue());
		// TODO Auto-generated method stub

	}

	}
}
