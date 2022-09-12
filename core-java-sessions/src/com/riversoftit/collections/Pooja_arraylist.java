package com.riversoftit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pooja_arraylist {
	
public static  void main(String[]args)
{
	List<String> items=new ArrayList<>() ;
	items.add("sandhya");
	items.add("lavanyaa");
	items.add("syamala");
	items.add("amala");
	Collections.addAll(items,"pawan", "samuel");
	Collections.sort(items);
	for(int i=0;i<items.size();i++) {
		System.out.print(items.get(i)+" ");
	}
	Collections.sort(items,Collections.reverseOrder());
	for(int i=0;i<items.size();i++) {
		System.out.print(items.get(i)+" ");
	}
}
}