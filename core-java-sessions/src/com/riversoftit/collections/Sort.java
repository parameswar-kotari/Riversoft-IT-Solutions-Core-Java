package com.riversoftit.collections;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int []m=new int[10];
		System.out.print("enter no of elemrnts in array: ");
		int n=sc.nextInt();
		int []m=new int[n];
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
		}
		for(int k=0;k<m.length;k++) {
			for(int t=k+1;t<m.length;t++) {
				int temp=0;
				if(m[k]>m[t]) {
					temp=m[k];
					m[k]=m[t];
					m[t]=temp;
				}
			}
			System.out.println("the sorted elements are :"+m[k]);
		}
		
	}

}
