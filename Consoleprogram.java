package console;

import java.util.Scanner;

public class Consoleprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   Scanner readme = new Scanner(System.in);
			   System.out.println("Enter Two Numbers:");
			   //two variables to hold numbers
			   double n1, n2, n3;
			   n1 = readme.nextDouble();
			   n2 = readme.nextDouble();
			   n3 = n1 + n2;
			   System.out.println("Total = " + n3);

	}

}
