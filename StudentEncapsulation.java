package com.oops;

public class StudentEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo  object= new EncapsulationDemo();
       object.setBranch("civil");
       object.setId(025);
       object.setName("Srihari");
       System.out.println("branch="+object.getBranch());
       System.out.println("id="+object.getId());
       System.out.println("name="+object.getName());
       
	}

}