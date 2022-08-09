package com.riversoftit.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Qexplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Queue<String> q=new PriorityQueue<>();
				q.add("Harish");
				q.add("Subbareddy");
				q.add("Pooja");
				q.add("Priyanka");
				System.out.println(q.remove(4));
				System.out.println(q.element());
				System.out.println(q.contains("Naruto"));
				ArrayDeque<String> dq=new ArrayDeque<>();
				dq.add("hari");
				dq.add("sandeep");
				dq.add("prawin");
				dq.add("Naruto");
				dq.addFirst("Saske");
				System.out.println(dq);
				System.out.println(dq.contains("teja"));
				System.out.println(dq.isEmpty());
				dq.addLast("Hokage");
				System.out.println(dq.element());

			}

		

	}


