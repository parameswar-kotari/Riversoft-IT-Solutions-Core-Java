package student;

public class Student {
	
	String city;
	String name;
	int studentId;
	
	public  String reportBuddyName() 
	{
		
		String name="HARISH";
		return name;
	}


	public Student(int studentId,String city) {
		
		this.studentId=studentId;
		this.city=city;
		
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public static void main(String args[]) {
		Student student1= new Student(123,"KADAPA");
		System.out.println("studentId=" +student1.getStudentId());
		System.out.println("city=" +student1.getCity());
		String name=student1.reportBuddyName();
		System.out.println("Name=" +name);
		
		
	}

}
