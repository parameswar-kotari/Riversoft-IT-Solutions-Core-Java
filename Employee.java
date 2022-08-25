package employee;

public class Employee {
	private String Employeename;
	private int Employeeid;
	private String Role;
	private String designation;
	private String PFnumber;
	private int Salary;

	public Employee(String Employeename, int Employeeid,String Role,String designation,String PFnumber, int Salary) 
	{
		this.Employeename = Employeename;
		this.Employeeid = Employeeid;
		this.Role= Role;
		this.designation= designation;
		this.PFnumber= PFnumber;
		this.Salary = Salary;

	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPFnumber() {
		return PFnumber;
	}

	public void setPFnumber(String pFnumber) {
		PFnumber = pFnumber;
	}

	public String getEmployeename() {
		return Employeename;
	}

	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}

	public int getEmployeeid() {
		return Employeeid;
	}

	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee("HARISH", 1232,"Java Programmer","Team Lead","ABC10165", 75000);
		System.out.println("Employee name=" + employee1.getEmployeename());
		System.out.println("Employee ID=" + employee1.getEmployeeid());
		
		System.out.println("Role="+employee1.getRole());
		System.out.println("Designation="+employee1.getDesignation());
		System.out.println("PF Account Number="+employee1.getPFnumber());
		System.out.println("Salary=" + employee1.getSalary());

		
	}
}