package com.bhavisha;

public class Modifiers2 {
	public int x,y,r;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setR(int r) {
		this.r = r;
	}
	public int add() {
		int addition=x+y;
		return addition;
	}
	public int sub() {
		int subtraction=x-y;
		return subtraction;
	}
	public int multipl() {
		int multiply=x*y;
		return multiply;
	}
	public int div() {
		int division=x%y;
		return division;
	}
	

}
