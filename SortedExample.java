package javaLearner;

import java.util.ArrayList;
import java.util.Collections;

public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al= new ArrayList();
		
		al.add(new Emp("bhashidhar",93988,21));
		al.add(new Emp("sridhar",94414,40));
		al.add(new Emp("virat",99481,30));
		al.add(new Emp("dhoni",12365,10));
		
	System.out.println(al);
	Collections.sort(al,new IdComparatorexam());
	System.out.println(al);
	ArrayList<Emp> all=new ArrayList<>(al);
	Collections.sort(all,new NameComparator());
	System.out.println(all);

	}

}
