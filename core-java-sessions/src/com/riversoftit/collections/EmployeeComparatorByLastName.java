package com.riversoftit.collections;

import java.util.Comparator;

public class EmployeeComparatorByLastName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getLastname().compareTo(o2.getLastname());
	}

}
