package com.Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> obj=new LinkedHashMap<>();
		obj.put("prakash", 87);
		obj.put("ball", 0);
		obj.put("gjhr", 0);
		for(Entry<String, Integer> entry:obj.entrySet()) {
			System.out.println("key="+entry.getKey()+" "+"value="+entry.getValue());
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
