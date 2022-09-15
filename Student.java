package com.Collections;

public class Student {
	int id ;
	String name;
	String place;
	int Number;
	public Student() {
		super();
	
	}
	public Student(int id, String name, String place, int number) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		Number = number;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", place=" + place + ", Number=" + Number + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPlace() {
		return place;
	}
	public int getNumber() {
		return Number;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setNumber(int number) {
		Number = number;
	}
	@Override
	public int hashCode() {
		return id+2;
		
	}
	
 public boolean equals(Object obj) {
	 if(((Student)obj).getId()==(this.getId())&&((Student)obj).getName().equals(this.getName())&&((Student)obj).getPlace().equals(this.getPlace())&&((Student)obj).getNumber()==(this.getNumber())) {
		 
		 return true;
		 
	 }
	 else
	 {
		 return false;
	 }
 }
public char[] size() {
	// TODO Auto-generated method stub
	return null;
}
}
