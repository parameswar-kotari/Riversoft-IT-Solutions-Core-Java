package com.riversoftit.collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List pvr=new ArrayList();
		System.out.println(pvr.isEmpty());
		pvr.add("Sandy");
		pvr.add(45.6f);
		pvr.add(12d);
		pvr.add(452);
		System.out.println(pvr.contains(452));
		System.out.println(pvr);
	}
}
