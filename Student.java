package com.classes;
public class Student {
	String name;
	int studentId;
	String Student=new String("buddy");
	String city;
	String hometown;
	
	
	
	public String reportBuddyName() {
		String str="subba reddy";
		return str;
	}
	public Student (int studentId,String name) {
		this.studentId=studentId;
		this.name=name;	
	}
	public String getBuddy() {
		String student="Harish";
		return student;
	}
	public String getHomeTown() {
		String city="kadapa";
		return city;
	}
	public String getName() {
		String name="Sri Hari";
		return name;
	}
	public int getStudentId() {
		int i=177010161;
		return i;
	}

	public void setBuddy(String student) {
		Student = student;
	}
	public void setHometown(String hometown) {
		return ;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public static void main(String [] args) {
		Student student1=new Student(177010161,"SubbaReddy");
		System.out.println("StudentId="+student1.getStudentId());
		System.out.println("name="+student1.getName());
		System.out.println("hometown="+student1.getHomeTown());
		System.out.println("buddy="+student1.getBuddy());
		System.out.println("reportbuddyname="+student1.reportBuddyName());
		
		}
	
	
	
	
		
		
		
	
}
