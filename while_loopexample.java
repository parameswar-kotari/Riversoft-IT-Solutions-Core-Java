import java.util.Scanner;
public class while_loopexample {

	public static void main(String[] args) {
		
		int num;
		System.out.println("enter any number:");
		Scanner obj=new Scanner(System.in);
		
		num=obj.nextInt();
		
		
		while(num>=0)
		{
		
			if (num%2==0)
			{
				
				System.out.println(" even number");
				break;
			}
				else
				{
					System.out.println("odd number");
					break;
				}
			
		}
		

	}

}
