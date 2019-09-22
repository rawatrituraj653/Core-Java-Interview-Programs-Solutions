package com.nit.sum.pairs;

import java.util.Scanner;

public class GettingPairs {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("enter Sum value");
		int arr[]={3, 6, 8, -8, 10, 8 } ;
		int sum=scanner.nextInt();
		int i,j,sumTemp=0,temp=0,temp1=0;
		for(i=0;i<arr.length;i++) {
			temp=arr[i];
			for(j=i+1;j<arr.length;j++) {
				temp1=arr[j];
				sumTemp=temp+temp1;
				if(sum==sumTemp)
					System.out.println("For Sum "+sum+" pairs is:: ("+temp+","+temp1+")");
			}
		}
		}catch (Exception e) {
			System.out.println("Enter Non Fraction Number");
		}
		finally {
			scanner.close();
		}
		
		
	}
}
