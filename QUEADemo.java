package com.Collections;

import java.util.PriorityQueue;

public class QUEADemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> yes =new PriorityQueue<>();
		yes.add(7457);
		yes.add(783);
		yes.add(20484);
		yes.add(7853);
		System.out.println(yes);
//		System.out.println(yes.poll());
//		System.out.println(yes);
//		System.out.println(yes.peek());
//		System.out.println(yes.poll() );
//		System.out.println(yes);
//		System.out.println(yes.contains(yes));
		System.out.println(yes.remove());
		System.out.println(yes);
		yes.clear();
		System.out.println(yes);
		
		
	}

}