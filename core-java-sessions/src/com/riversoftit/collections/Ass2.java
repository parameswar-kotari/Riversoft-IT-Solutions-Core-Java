package com.riversoftit.collections;
import java.util.*;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> v=new Vector();
		v.add("anil");
		v.add("kumar");
		v.add("pandu");
		v.add("surya");
		List l=new Vector();
		l.add(10);
		l.add(21);
		l.add(90);
		l.addAll(v);
		System.out.println(l);
		
		
		for(Object l2:l) {
			System.out.println(l2);
		}
		ListIterator itr=l.listIterator();
		while(itr.hasNext()) {
			Object b=(Object) itr.next();
			if(b.equals("anil")) {
				System.out.println(b);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(l);
	}

}
