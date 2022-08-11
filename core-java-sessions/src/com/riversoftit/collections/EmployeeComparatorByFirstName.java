package com.riversoftit.collections;

import java.util.Comparator;

public class EmployeeComparatorByFirstName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getFirstname().compareTo(o2.getFirstname());
	}

}
