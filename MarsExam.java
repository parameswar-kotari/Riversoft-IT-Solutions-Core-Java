import java.util.ArrayList;
import java.util.List;

public class MarsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5,9,21,0,2,55,1};
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
			}
			else if(array[i]>secondLargest) {
				secondLargest=array[i];
			}
				
			}
		System.out.println(secondLargest);
		}

		
	}


