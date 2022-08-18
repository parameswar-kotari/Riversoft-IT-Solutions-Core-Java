package strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1= "Hari";
		String name2="Sita Ram";
		System.out.println("Name1=" +name1);
		System.out.println("Name2=" +name2);
		System.out.println(name1.toLowerCase( ));
		System.out.println(name2.toUpperCase());
		System.out.println(name2.charAt(2));
		System.out.println(name1.length());
		System.out.println(name2.substring(3,6));
		System.out.println(name2.toString());
		System.out.println(name1.valueOf(name1));
		System.out.println(name2.toCharArray());
		System.out.println(name1.split(name1));
		System.out.println(name1.indexOf("a"));
		if(name1==name2)
		{
			System.out.println("STRINGS ARE EQUAL");
		}
		else
		{
			System.out.println("STRINGS ARE NOT EQUAL");
		}
		System.out.println(name2.getBytes());
		System.out.println(name1.endsWith("ri"));
		System.out.println(name2.startsWith("S"));
	}

	}
