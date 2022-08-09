package com.riversoftit.collections;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue();
		for(int i=1;i<=5;i++) {
			q1.offer(i);
		}

		
		
	Queue<Integer> q=new PriorityQueue();
		
		//q.add("anil");
		//q.offer("ajay");
		//q.offer("mahesh");
		//q.offer("umar");
		q.addAll(q1);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		Iterator itr=q.iterator();
		while(itr.hasNext()) {
			Integer k=(Integer)itr.next();
			if(k%2==0) {
				System.out.println(k);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(q);
		





	}

	

}
