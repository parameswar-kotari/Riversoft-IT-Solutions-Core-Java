package com.riversoftit.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method
				// TODO Auto-generated method stub
				Stack<String> stack=new Stack<>();
				stack.add("Teja");
				stack.push("Naruto");
				stack.add(0, "Harish");
				System.out.println(stack.capacity());
				System.out.println(stack.contains("Saske"));
				System.out.println(stack.pop());
				
				System.out.println(stack.peek());
				
			}

		

	}


