package com.classes;
import java.util.Date;
public class DateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.getDate());
		System.out.println(date.getDay());
	    System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.toString());
		System.out.println(date.toInstant());
		System.out.println(date.after(date));
		

	}

}
