
public class StaticExample {
	
	String emplyoeename;
	int id;
	int salary;
	static String companyname="IBM";
	
	StaticExample(String n,int i,int s){
		emplyoeename=n;
		id=i;
		salary=s;
	}
	
	static void change() {
		companyname="wipro";
	}
	
	void demo() {
		System.out.println(emplyoeename+" : "+ id +" : "+salary+"  : "+companyname);
	}

	public static void main(String[] args) {
		StaticExample.change();
		StaticExample jack =new StaticExample("shashidhar",165,20000);
		StaticExample rose = new StaticExample("kristein",166,50000);
		StaticExample mick = new StaticExample("stewart",167,60000);
		jack.demo();
		rose.demo();
		mick.demo();

	}

}
