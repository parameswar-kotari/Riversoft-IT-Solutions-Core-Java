import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		int num=10;
		
		Scanner obj=new Scanner(System.in);
		
		num=obj.nextInt();
		
		System.out.println("enter a number:=");
		
		if(num%2==0){
			System.out.println(num+"is even");
				
			}
		else
		{
			System.out.println(num+"is odd");
		}
		}
		

	}


