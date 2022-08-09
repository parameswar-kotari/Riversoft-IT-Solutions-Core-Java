package com.riversoftit.collections;
import java.util.*;

public class Kumar {
	public static void main(String[] args) {
		Stack l=new Stack();
		Stack f=new Stack();
			for(int i=1;i<=5;i++) {
				System.out.println(f.push(i));
			}
		
		l.add(12);
		l.push(23);
		l.push(21);
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l.pop());
		System.out.println(l);
		l.clear();
		System.out.println(l.isEmpty());
		Stack l2=new Stack();
		l2.add("anil");
		l2.push("kumar");
		l2.push("reddy");
		Stack l1=new Stack();
		l1.addAll(l2);
		l1.add(12);
		l1.push(23);
		l1.push(21);
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.search("anil"));
		System.out.println(l1.search(12));
		l1.pop();
		l1.pop();
		l1.addAll(f);
		System.out.println("------------"+l1.get(0));
		System.out.println(l1);
		System.out.println(l1.pop());
		ListIterator itr=l1.listIterator();
		while(itr.hasNext()) {
			Object o=(Object)itr.next();
			if(o.equals(5)) {
				System.out.println("5 was removing  "+o);
			}
			else
			{
				itr.remove();
				
			}
		}
		
		

	}

}
