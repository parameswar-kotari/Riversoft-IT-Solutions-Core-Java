package com.bhavisha;

abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("i am bad");
	}
}
class Circle1 extends Shape{
	void draw() {
		System.out.println("circle area=pi*radius");
	}
}
class TestAbstraction1{
	public static void main(String[] args) {
		Shape s=new Circle1();
		s.draw();
	}
}
