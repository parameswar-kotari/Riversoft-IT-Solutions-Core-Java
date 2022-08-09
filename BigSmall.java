package bigsmall;

import java.util.Scanner;

public class BigSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method 
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value of A=");
    System.out.println("Enter the Value of B=");
    a=sc.nextInt();
    b=sc.nextInt();
    if (a>b)
    
    	System.out.print("A is Bigger Number");
    
    else if (a<b) 
        System.out.println("B is Bigger Number");
	
    else

	    System.out.println("A is Equal to B");
	}
}

