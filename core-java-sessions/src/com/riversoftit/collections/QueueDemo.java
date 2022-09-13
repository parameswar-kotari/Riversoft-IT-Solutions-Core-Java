package com.riversoftit.collections;



import util.java.LinkedList;
import util.java.*;
//import java.util.priorityQueue;

	public class QueueDemo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		boolean offer(Object 0)
	Queue qu = new LinkedList();
//	qu.add(4);
//	qu.add(2);
//	qu.add(10);
	for(int i=1; i<=10;i++) {
		qu.offer(i);
		}
	System.out.println(qu);
//		object poll();
	System.out.println(qu.poll());
		System.out.println(qu);
//	
//		
//		priority queue
//		Queue que = new priorityQueue<>();
//		que.add(4);
//		que.add(2);
//		que.add(10);
//		System.out.println("==priorityQueue==");
//		System.out.println(que);
//		System.out.println("poll : "+que.poll());
//		System.out.println(que);
		
}
	}

