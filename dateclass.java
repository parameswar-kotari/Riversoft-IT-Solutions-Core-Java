package com.riversoftit.collections;
//import java.time.LocalTime;
//import java.util.*;
//import java.time.format.DateTimeFormatter;  
//import java.time.Year;
//import java.time.LocalDate; 
//import java.time.Clock;
import java.time.*; 

public class dateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date d1=new Date();
//		System.out.println("current date is"+ d1);
	
//	    LocalTime time = LocalTime.now();  
//	    System.out.println(time);  
//	      LocalDate Time now=LocalDate Time.now();  
//	        System.out.println("Before Formatting: " + now);  
//	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
//	        String formatDateTime = now.format(format);  
//	        System.out.println("After Formatting: " + formatDateTime); 
//		Year y = Year.of(2017);  
//	    LocalDate l = y.atDay(123);  
//	    System.out.println(l);  
//		Clock c = Clock.systemDefaultZone();      
//	    System.out.println(c.getZone());  
		 MonthDay month = MonthDay.now();  
		    LocalDate date = month.atYear(2024);  
		    System.out.println(date);  

	}

}
