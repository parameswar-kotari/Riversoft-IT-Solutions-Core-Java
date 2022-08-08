package com.riversoftit.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vector=new Vector<String>();
		vector.add("Harish");
		vector.add("Anil");
		vector.add("Sudhir");
//		for(int i=0;i<vector.size();i++)
//		{
//			System.out.println(i+" "+ vector.get(i));
//		}
//		for(String s:vector)
//		{
//			System.out.println(s);
//		}
//		
		vector.addAll(vector);
		vector.set(1, "dfguyh");
		ListIterator itr=vector.listIterator();
		while(itr.hasNext())
		{ 
//			String s=(String) itr.next();
//			if(s.equals("Anil"))
//				itr.remove();
			System.out.println(itr.next());
		}
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}

}
