package com.riversoftit.collections;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedLstExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				LinkedList<String> linkedLists=new LinkedList<>();
				linkedLists.add("Harish");
				linkedLists.add("Suresh");
				linkedLists.add(null);
				linkedLists.add("Anil");
				linkedLists.addFirst("pooja");
				linkedLists.addLast("Teja");
				linkedLists.set(2, "Subbareddy");
				System.out.println(linkedLists);
				System.out.println(linkedLists.element());
				System.out.println(linkedLists.get(2));
				System.out.println(linkedLists.peek());
				//linkedLists.sort("Teja");s
				System.out.println(linkedLists.remove(2));
				System.out.println(linkedLists.contains("Harish"));
				//Iterator<?> iterator=linkedLists.iterator();
				//while(iterator.hasNext())
				//{
					//System.out.println(iterator.next());
				//}
				

			}

		

	}


