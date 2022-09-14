package javaLearner;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp> {

	public NameComparator() {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
