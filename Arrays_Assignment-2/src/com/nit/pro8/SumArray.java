package com.nit.pro8;

public class SumArray {

	public static void main(String[] args) {
		int [] arr={4, 5, 6,1,3,8,7};
		int i,j,temp,sum=0,arr2[]=new int[arr.length];
	
		//perform Adding except that index
		for(i=0;i<arr.length;i++) {
			temp=arr[i];
			for(j=0;j<arr.length;j++) {
				sum=sum+arr[j];
			}
			arr2[i]=sum-temp;
			sum=0;
		}
		
		//print array element
		System.out.println("All Element of Array.....");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		//print after sum element
		System.out.println("\nAll Element sum of expect that index element");
		for(i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+"  ");	
		}
	}
}
