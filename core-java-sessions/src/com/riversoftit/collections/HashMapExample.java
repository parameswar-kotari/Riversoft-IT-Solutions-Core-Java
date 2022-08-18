package com.riversoftit.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(12, "pawan");
		map.put(1, "abc");
		//map.remove(1);
		map.put(1, "def");
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			System.out.println("Key="+entry.getKey()+" "+"value="+entry.getValue());
		}

	}

}
