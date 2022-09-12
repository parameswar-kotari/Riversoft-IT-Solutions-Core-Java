import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(15);
		list.add(12.234f);
		list.add("Kiran");
		System.out.println(list);
		System.out.println(list.contains(list));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.toString());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		ArrayList<String>list1=new ArrayList<>();
		list1.add("sai");
		list1.add("cricket");
	    list1.add("surendra");
		for(String s:list1) {
			System.out.println(s);
		}
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		ListIterator<String> st=list1.listIterator();
		while(st.hasPrevious()) {
			System.out.println(st.previous());
		}

	}

}
