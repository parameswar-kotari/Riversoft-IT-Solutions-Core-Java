import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getSeconds());
		System.out.println(date.getHours());
		System.out.println(date.toInstant());
		
		

	}

}
