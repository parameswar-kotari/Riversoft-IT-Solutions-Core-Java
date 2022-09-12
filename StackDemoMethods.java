package com.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemoMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>str=new Stack<Integer>();
		str.push(25);
		str.push(52);
		str.push(32);
		str.push(100);
		str.push(200);
		//boolean result=str.empty();
		//System.out.println("Is the stack empty?"+result);
		System.out.println("pushing elements="+str);
		str.pop();
		System.out.println("after pop operation="+str);
		System.out.println(str.peek());
		str.pop();
		System.out.println(str);
		System.out.println(str.peek());
		Stack<String>str1=new Stack<String>();
		str1.push("Sai");
		str1.push("SriHari");
		str1.push("Samuel");
		str1.push("sai");
		System.out.println("pushing elements using String="+str1);
		str1.pop();
		System.out.println(str1);
		str1.pop();
		System.out.println(str1);
		System.out.println(str1.peek());
		System.out.println("Elements in the Stack:"+str1);
		
		String names=str1.peek();
		System.out.println("Elements at top is="+names);
		
		boolean result=str1.empty();
		System.out.println("Is the stack empty?"+result);
		int location = str1.search("Sai");
		System.out.println("location of ="+location);
		Iterator itr=str1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
