package com.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>animal=new Vector<String>();
		animal.add("IT");
		animal.add("Become ");
		animal.add("Popular");
		animal.add(3,"More" );
		animal.size();
		System.out.println(animal.size());
		System.out.println("vector"+animal);
		Vector<String>mamals=new Vector<>();
		mamals.add("teja");
		mamals.add("suresh" );
		mamals.add("full" );
		mamals.add(1,"sreenu");
		mamals.remove(0);
		System.out.println("vector2"+" "+mamals);
		//mamals.clear();
		//System.out.println("vector2 after getting clear="+mamals);
		mamals.set(1,"Sai" );
		System.out.println("vector2"+" "+mamals);
		System.out.println(mamals.toArray());
		System.out.println(mamals.toString());
		System.out.println(mamals.contains(animal));
		

	}

}
