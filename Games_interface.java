package com.bhavisha;

interface Hockey{
	void play();

}
interface FootBall{
	void kick();
}
interface Cricket extends Hockey,FootBall{
	void show();
}
public class Games_interface{
	public static void main(String[] args) {
		Cricket obj=new Cricket() {
			public void play() {
				System.out.println("i am playing");
			}
			public void kick() {
				System.out.println("i am kicking");
			}
			public void show() {
				System.out.println("i am showing");
			}
		};
		obj.kick();
		obj.play();
		obj.show();
	}
}
		
		
		
		
	
