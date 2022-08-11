package com.riversoftit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee("Jack","XYZ",101,25));
		employeeList.add(new Employee("Jones","XYZ",120,25));
		employeeList.add(new Employee("ABC","ABC",10,25));
		employeeList.add(new Employee("ABC","XYZ",1,25));
		employeeList.add(new Employee("DEF","XYZ",451,25));
		//Collections.sort(employeeList, new EmployeeComparatorByFirstName());
		
		Comparator<Employee> sortByFistandLastnames=Comparator.
				comparing(Employee::getFirstname).thenComparing(
						Employee::getLastname);
				
		
		Collections.sort(employeeList,sortByFistandLastnames );
		System.out.println(employeeList.toString());
		

	}

}
