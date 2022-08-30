
public class MethodsOfString {

	public static void main(String[] args) {
		String s1="java";
		String s2 ="good";
		String s3="BETTER";
		String name="Beautiful";
		System.out.println(s1.length());//to find the number of characters in string
		System.out.println(s2.length());
		System.out.println(s1.indexOf("v"));// to find the index 
		System.out.println(s2.indexOf("d"));
		System.out.println(s1.substring(1));//it eleminates the 1
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		char ch=name.charAt(2);//prints the character
		System.out.println(ch);
		System.out.println(s1.compareTo(s2));//compare the length of 2 string
		s1=s1.concat("is object oriented program");//joing the 2 string
		System.out.println(s1);
		System.out.println(s2.endsWith("d"));//checks wheater it ends with string
		System.out.println(s1.equals(s2));//wether it is equal to  length ofstring or not
		System.out.println(s1.equalsIgnoreCase(s3));//it ignores the case sensitive
		
		
		
		

		
		
		// TODO Auto-generated method stub

	}

}
