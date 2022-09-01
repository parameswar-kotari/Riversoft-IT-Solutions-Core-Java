package com.riversoftit;
import java.util.*;
public class ScannerExample1 {
	public static String consoleusernumber(Scanner s) {
		System.out.println("Enter any string");
		String str=s.nextLine();
		return str;
	}
		
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner Scanner= new Scanner(System.in);
		String data=consoleusernumber(Scanner);
		System.out.println(data.toUpperCase());
		System.out.println(data.toLowerCase() );
		data=data+"and java is object oriented program";
		System.out.println(data);
		

	}

}
