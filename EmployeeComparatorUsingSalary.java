package com.collections;

import java.util.Comparator;

public class EmployeeComparatorUsingSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getSalary()==emp2.getSalary()) {
			return 0;
			
		}
		if(emp1.getSalary()>(emp2.getSalary())) {
			return 1;
		}
		else {
			return -1;
		}
	}
	

}
