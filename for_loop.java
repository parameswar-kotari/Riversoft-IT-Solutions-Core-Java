import java.util.Scanner;
public class for_loop {
	
	public static void main(String args[]) {
		
		int num;
		System.out.println("enter any number: ");
		Scanner obj=new Scanner(System.in);
		
		num=obj.nextInt();
		

		
		for(int i=2;i<=20;i++) {
			
			System.out.println(num*i);
			
			
		}
	}

}
