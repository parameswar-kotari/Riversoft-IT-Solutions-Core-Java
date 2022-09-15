package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> tree=new HashMap<>();
		Map<Integer, String> map;
		tree.put(3,"tree");
		tree.put(0,"plant");
		tree.put(0,"pot");
		//Iterator itr=tree.iterator();  
		//while(itr.hasNext()){  
		//System.out.println(itr.next());  
		for(Map.Entry<Integer,String> entry:tree.entrySet()) {
			System.out.println("key="+entry.getKey()+" "+"value="+entry.getValue());
		}
		
		}  
		 
		
		

	}


