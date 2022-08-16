import java.util.Scanner;
public class do_whileexample {

	public static void main(String[] args) {
		
		int num;
		System.out.println("enter any number:");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		
		do
		{
			System.out.println(num+"");
			++num;
		}
		
		while(num<=10);
		
		
	}

}
