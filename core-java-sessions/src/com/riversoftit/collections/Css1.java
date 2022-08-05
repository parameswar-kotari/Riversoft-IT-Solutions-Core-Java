package com.riversoftit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Css1 {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
	    List<String> l1=new ArrayList<String>();
	    l1.add("anil");
	    l1.add("dfg");
	    l1.add("kumar");
	    System.out.println(l1);
	    l1.add(1,"uio");
	    System.out.println(l1);
	    l.add(10);
	    l.add(12.4f);
	    l.add("ghy");
	    System.out.println(l);
	    l1.addAll(l);
	    System.out.println(l1);
	    System.out.println(l1.size());
	    System.out.println(l1.contains(10));
	    System.out.println(l.contains("anil"));
	    System.out.println(l1.containsAll(l));
	    System.out.println(l.containsAll(l1));
	    l1.clear();
	    System.out.println(l1);
	    System.out.println(l1.isEmpty());
	    System.out.println(l.indexOf(10));
	    System.out.println(l.remove(1));
	    System.out.println(l);
	    System.out.println(l.remove(1));
	    System.out.println(l);
	    l.add(23);
	    l.add(40);
	    l.add(12);
	    l.add(87);
	    l.add(32);
	    l.add(25);
	    System.out.println(l);
	    Iterator itr=l.iterator();
	    while(itr.hasNext()) {
	    	int k=(Integer)itr.next();
	    	if(k%2==0) {
	    		System.out.println("even of"+k);
	    	}
	    	else {
	    		itr.remove();
	    	}
	    	 //System.out.println(k);

	    }
	    System.out.println(l);
	    ArrayList<String> l2=new ArrayList<String>();
	    l2.add("kumar");
	    l2.add("reddy");
	    l2.set(0, "hjk");
	    l2.add("pandu");
	    l2.add("ladu");
	    l2.add("varun");
	    l2.set(3, "anil");
	    //System.out.println(l.retainAll(l1));
	    ArrayList sec_list = new ArrayList();
        sec_list = (ArrayList)l2.clone();
        System.out.println(sec_list);
        Collections.sort(sec_list);
        for(Object names:sec_list) {
        	System.out.println(names);
        	
        }
	    

	    }

}
