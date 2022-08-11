package com.riversoftit.collections;

public class Student implements Comparable<Student> {
	
		private String firstname;
		private String lastname;
		private int id;
		private int age;
		
		public Student() {
			super();
			
		}
		
		public Student(String firstname, String lastname, int id, int age) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.id = id;
			this.age = age;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			if(this.id>o.id)
				return 1;
			else if(this.id<o.id)
				return -1;
			else
				return 0;
			
		}

		@Override
		public String toString() {
			return "Student [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + ", age=" + age + "]";
		}

}
