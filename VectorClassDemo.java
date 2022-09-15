package com.Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorClassDemo {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(67);
		vector.add(92);
		vector.add(67);
		vector.add(98);
		Iterator<Integer> itr=vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// TODO Auto-generated method stub

	}

}
