package com.riversoftit.collections;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectroListExplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<String> list=new Vector<String>();
				list.add("Ramu");
				list.add("Anil kumar");
				list.add("Arjun");			
				list.addAll(list);
				System.out.println(list.isEmpty());
				list.remove(1);
				System.out.println(list);
				System.out.println(list.containsAll(list));
				System.out.println(list.get(2));
				System.out.println(list.contains("Ramu"));
				//list.clear();
				//System.out.println(list);
			ListIterator itr=list.listIterator();
				while(itr.hasNext())
				{ 
				String s=(String) itr.next();
					if(s.equals("Arjun"))
						itr.remove();
					//System.out.println(itr.next());
					System.out.println(list);
					
				
					
				}
				list.clear();
				System.out.println(list);
			}
}



	


