package com.riversoftit.collections;


class OverRiding{
	 static int add(int a,int b)
	{
return a+b;
}
	int ytg(int a,int b,int c)
	{
		return a+b+c;
	}
	 static int sub(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	
}	
public class Overloading{
	public static void main(String[] args) {
		OverRiding obj = new OverRiding();
		System.out.println("In Overloading Class");
		System.out.println(obj.add(8, 760));
		System.out.println(obj.sub(34,34 ,54 , 7));
		System.out.println(obj.ytg(56,77 , 56));
	}
}


