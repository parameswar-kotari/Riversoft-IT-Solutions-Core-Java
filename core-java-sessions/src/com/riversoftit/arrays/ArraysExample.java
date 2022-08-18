package com.riversoftit.arrays;

import java.util.Arrays;

public class ArraysExample {
	
	public static int[] sumOfElements(int[] arr)
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+1;
		}
		//System.out.println("total="+total);
		return arr;
	}

	public static void main(String[] args) {
		//type[] name = new type[length];
		int[] a= {23,24,34,3,1};
		int[] incrementedArray=sumOfElements(a);
		System.out.println("incrementedArray="+Arrays.toString(incrementedArray));
//		String[] stringArray= {"Java","is","high","level","programming Language"};
//		stringArray[0]="Java";
//		stringArray[1]="Programming";
//		stringArray[2]="Language";
//		for(int i=0;i<=stringArray.length-1;i++)
//		{
//			System.out.println(stringArray[i]);
//		}
//		int i=0;
//		while(i<stringArray.length)
//		{
//			System.out.printf("%s ", stringArray[i]);
//			i++;
//		}
//		
//		
//		System.out.println(Arrays.toString(stringArray));
//		Arrays.sort(stringArray);
//		System.out.println(Arrays.toString(stringArray));
	}

}
