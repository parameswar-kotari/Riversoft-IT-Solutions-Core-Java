package com.bhavisha;

public class Modifiers3 extends Modifiers2 {
public static void main(String[] args) {
	  Modifiers2 mens;
	  mens =new Modifiers2();
	  mens.r=65;
	  mens.x=35;
	  mens.y=86;
	  int add=mens.add();
	  int sub=mens.sub();
	  int multipl=mens.multipl();
	  int div=mens.div();
	  System.out.println(add);
	  System.out.println(sub);
	  System.out.println(multipl);
	  System.out.println(div);
			  
	  
}
}
