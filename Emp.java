package javaLearner;

import java.util.Comparator;

public class Emp  {
	
	   private String name;
	   private int mobilenumber;
	   private int id;
	   
	   
	public Emp(String name, int mobilenumber, int id) {
		super();
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", mobilenumber=" + mobilenumber + ", id=" + id + "]";

	
	}

	
	}
	   
	   


