
public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {200,250,1,3,5,10,20,30,40,50,60};
		int sum=0;
	
		int lengthOfArray= arr.length;

       for(int i=0;i<lengthOfArray;i++) {
    	   
    	   sum=sum+arr[i];
    	   System.out.println(sum);
    	   
    	   
       }
       for(int a:arr) {
    	   System.out.println(a);
	}

	}
}
