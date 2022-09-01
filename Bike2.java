package com.bhavisha;

interface Bank1 {
 public void getrateofinterest();
}
class Hdfc implements Bank1{
	public void getrateofinterest() {
		System.out.println("getting Money");
		
	}
}
class Sbi implements Bank1{
	public void getrateofinterest() {
		System.out.println("Money getting");
	}
}
public class Bike2{
	public static void main(String []args) {
		Bank1 bg=new Sbi();
		bg.getrateofinterest();
		
	}
}