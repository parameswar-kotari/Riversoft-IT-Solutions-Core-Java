package com.Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class Queaue {

	public static void main(String[] args) {
		Queue<String>obj=new ArrayDeque<>();
		// TODO Auto-generated method stub
		obj.add("fge");
		obj.add("okxw");
		obj.add("appl");
		obj.add("best");
		Collections.addAll(obj,"kiran","pawan");
		//System.out.println(obj.addAll(add,));
		System.out.println(obj.element());
		System.out.println(obj);
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj));
		System.out.println(obj.isEmpty());
		System.out.println(obj.peek());
		System.out.println(obj.poll());
		System.out.println(obj);
    System.out.println(obj.element());
    System.out.println(obj.offer("vdct"));
		System.out.println(obj);
		

	}

}
