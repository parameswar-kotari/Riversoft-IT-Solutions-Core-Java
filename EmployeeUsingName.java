package com.collections;

import java.util.Comparator;

public class EmployeeUsingName implements Comparator <Employee>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getName().equals(emp2.getName())) {
			
			return 0;
			
		}
		if(emp1.getName().compareTo(emp2.getName())>0) {
			
			return 1;
		}
		else {
			return -1;
		}
		
	}

}
