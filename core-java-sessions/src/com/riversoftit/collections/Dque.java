package com.riversoftit.collections;
import java.util.*;
//import java.lang.iterable;

public class Dque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque q=new ArrayDeque();
		q.add("anil");
		q.push("mahesh");
		q.push("suresh");
		q.add("lohith");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.element());
		//q.clear();
		//System.out.println(q.element());
		System.out.println(q.poll());
		String s=(String)q.peekLast();
		System.out.println(s);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		q.push("param");
		q.push("umesd");
		q.push("ganesh");
		System.out.println(q);
		System.out.println(q.size());
		Object[] mkl=q.toArray();
		for(Object q1:mkl) {
			System.out.println(q1);
		}
		System.out.println(q.peekLast());

		


		

		


		
	

	}

}
