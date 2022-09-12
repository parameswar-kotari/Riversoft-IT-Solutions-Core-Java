package com.bhavisha;

 class Civil {
	 void strength() {
System.out.println("civil engineering");
}
 }
	 class Computer extends Civil {
		 void python() {
			 System.out.println("computer engineering");
		 }
	 }
	 class Electric extends Civil{
		 void electric()
		 {
			 System.out.println("elecrical engineering");
			 
			 }
		 }
	 class Mechanical extends Computer{
		 void fluid() {
			 System.out.println("Mecanical engineering");
		 }
	 }
	 public class Btech{
		 public static void main(String[] args) {
			 Mechanical obj=new Mechanical();
			 obj.fluid();
			 obj.strength();
			 obj.python();
		 }
	 
		 }
	 
	 
