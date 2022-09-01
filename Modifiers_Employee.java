package com.bhavisha;

public class Modifiers_Employee {
	public int empid;
	private String empname;
	protected float salary;
	String domain;
	public Modifiers_Employee() {
	
	}
	public Modifiers_Employee(int empid, String empname, float salary, String domain) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.domain = domain;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public void Salary(double d) {
		// TODO Auto-generated method stub
		
	}
}
	
