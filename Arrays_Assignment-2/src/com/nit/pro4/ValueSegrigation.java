package com.nit.pro4;

public class ValueSegrigation {

	public static void main(String[] args) {
		int arr[]= {0, 1, 0, 2, 0, 0, 2, 1, 2, 0,1,0,2};
		int i,zeros=0,ones=0,count=0;
		
		System.out.println("All Ellement Randomly..");
		for( i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]==0) 
				zeros++;
			else if(arr[i]==1)
				ones++;
		}
		
		for( i=0;i<zeros;i++){
			arr[i]=0;
			count++;
		}
		count=count+ones;
		for(i=zeros;i<count;i++) {
			arr[i]=1;
		}
		for( i=count;i<arr.length;i++) {
			arr[i]=2;
		}
	
		System.out.println("\nSegrigate Elements....");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
