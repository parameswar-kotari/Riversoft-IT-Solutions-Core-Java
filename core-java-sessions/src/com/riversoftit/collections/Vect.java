package com.riversoftit.collections;
import java.util.*;

public class Vect {

	public static void main(String[] args) {
	   Vector<String> v=new Vector();
	   v.add("anil");
	   v.add("kumar");
	   v.add("pandu");
	   v.add("harsha");
	   Vector v1=new Vector();
	   v1.add(10);
	   v1.add(23);
	   v1.add(34);
	   v1.addAll(v);
	   System.out.println(v1);

	}

}
