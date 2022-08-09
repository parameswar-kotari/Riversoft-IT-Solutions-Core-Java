package com.riversoftit.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<>();
		q.add(23);
		q.add(1);
		q.add(4);
		q.add(25);
		q.remove();
		System.out.println(q.remove(4));
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.add(23);
		dq.add(1);
		dq.add(4);
		dq.add(25);
		dq.addFirst(0);
		//dq.addLast(null);
		dq.remove();
		System.out.println(dq);
		//q.clear();

	}

}
