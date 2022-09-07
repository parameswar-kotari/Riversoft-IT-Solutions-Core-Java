import com.riversoftit.string.Employee;
import static java.lang.Math.PI;
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setName("roar teja");
		emp.setId(2558145);
		emp.setSalary(28828);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}


