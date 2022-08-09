package com.riversoftit.collections;
import java.util.*;

public class Linexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String>();
		l.add("anil");
		l.addFirst("kumar");
		l.add("mahesh");
		l.add(0,"reddy");
		l.add("sudher");
		System.out.println(l);
		l.set(0, "lokesh");
		System.out.println(l);
		l.addLast("kiran");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeFirst();
		l.removeFirst();
		System.out.println(l);
		l.removeFirstOccurrence("anil");
		System.out.println(l);
		l.removeLastOccurrence(l);
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		for(String l1:l) {
			System.out.println(l1);
		}
		
		//ArrayList<String> kio=new ArrayList<String>();
		Object[] obj=l.toArray();
		int i=0;
		for(Object jkl:obj) {
			
			i++;
			System.out.println(jkl+"    "+i);
			
		}

}

	

}
