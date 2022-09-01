package com.hybridinheritance;

public class Result extends Exam implements Project {
	
	int sum = pm+Project.pmark;
	
	public static void main(String [] args) {
		Result obj=new Result();
		obj.disp();
	}
		
	

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
		System.out.println("Roll="+rollno);
		System.out.println("Theory="+theory);
		System.out.println("Practical="+practical);
		System.out.println("project="+Project.pmark);
		System.out.println("Total marks="+sum);
		
	}
	

}

