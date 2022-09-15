package com.Collections;

import java.util.Iterator;
import java.util.Stack;

public class StackListDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>(); 
		stack.push("hjvier");
		stack.push("aoif");
		stack.push("oixiii3");
		stack.push("animmal");
		
    Iterator<String> itr=stack. iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
        }

	}

}
