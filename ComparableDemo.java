package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(2500,"kiran"));
		System.out.println(employeeList);
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(3500,"jack"));
		empList.add(new Employee(3500,"john snow"));
		empList.add(new Employee(8000,"harish"));
		System.out.println(empList);
		Collections.sort(empList,new EmployeeComparatorUsingSalary());
		System.out.println(empList);
		Collections.sort(empList,new EmployeeUsingName());
		System.out.println(empList);
		Collections.sort(empList,Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		System.out.println(empList);
		
		

	}

}
