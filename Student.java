package com.collections;

public class Student {

	private int id;
		private String name;
		public Student() {
			super();
		
		}
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
		return id+22;
	}
	public boolean equals(Student obj) {
		if(obj.getName().equals(this.getName())&& obj.getId()==this.getId()) {
return true;
		}
		else {
			return false;
		}
	
	}
		}



	


