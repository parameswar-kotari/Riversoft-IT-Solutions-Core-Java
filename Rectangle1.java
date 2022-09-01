package com.classes;

public class Rectangle1 {
	static int length,breadth;
	public Rectangle1() {
		
	}
	public Rectangle1(int l,int b) {
		this.length=l;
		this.breadth=b;
		
	}
   public static int calculateperimeter() {
		
		int perimeter=2*(length*breadth);
		//System.out.println("perimeter="+perimeter);
		return perimeter;

}
}
