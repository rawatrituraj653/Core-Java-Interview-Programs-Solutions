package com.nit.pro3;

public class ValueSegrigation {

	public static void main(String[] args) {
		int count=0,arr[]={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		//loop for getting zeros
		System.out.println("Giving Array...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
			if(arr[i]==0)count++;
			
		}
		//add Zeros in arrays
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		//add ones in arrays
		for(int i=count;i<arr.length;i++) {
			arr[i]=1;
		}
		//print all segrigate element
		System.out.println("\nSegrigate Array...");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		
	}
}
