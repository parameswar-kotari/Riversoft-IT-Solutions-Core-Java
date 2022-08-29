package iterations;

import java.util.*;

class Marks extends Student {
	int m1,m2,m3,sum;

	public Marks(Scanner s) {
		super(s);
		this.s=s;
	}
	public void marks() {
		System.out.println("three subject marks");
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		System.out.println("total marks="+(m1+m2+m3));
		
		
	}
	
	}


