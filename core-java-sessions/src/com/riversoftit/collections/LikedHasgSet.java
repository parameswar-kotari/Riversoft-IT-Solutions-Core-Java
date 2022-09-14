package com.riversoftit.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LikedHasgSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet();
		set.add("mass");
		set.add("mirchi");
		set.add("pokiri");
		set.add("mass");
		Iterator<String> i=set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
