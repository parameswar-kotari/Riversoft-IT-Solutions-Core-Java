package com.riversoftit.collections;

public class Goodoo {


		// TODO Auto-generated method stub
		 
		    //function to check if person is eligible to vote or not   
		    public static void vote(int age) {  
		        if(age<18) {  
		        	throw new ArithmeticException("person is not eligibel to vote"); 
		        }
		        	else {
		        	
		        		System.out.println("person is eligibel");
		        	
		            //throw Arithmetic exception if not eligible to vote  
		        }
		    }
		    public static void main(String[] args){
		    	vote(87);
		    	System.out.println("i am programm");
		    	
		    }
}


