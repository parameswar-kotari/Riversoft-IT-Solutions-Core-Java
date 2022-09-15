package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map=new HashMap<>();
		map.put(1,"Java" );
		map.put(3,"Secure" );
	    map.put(2, "Simple");
		for(Map.Entry<Integer, String>entry:map.entrySet()) {
			//System.out.println("key="+entry.getKey());
			//System.out.println("Value="+entry.getValue());
			System.out.println("key="+entry.getKey()+" "+"value="+entry.getValue());
		}
		

	}

}
