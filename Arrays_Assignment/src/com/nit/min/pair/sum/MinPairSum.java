package com.nit.min.pair.sum;

public class MinPairSum {

	public static void main(String[] args) {
		int []arr= {1, 6, 3, 7,2,1};
		int min=0,i,j,sum=0,temp=0,temp1=0;
 		for(i=0;i<arr.length;i++) {
			temp=arr[i];
			for(j=i+1;j<arr.length;j++) {
		 	temp1=arr[j];
				sum=temp+temp1;
				if(sum>0&&min==0)
					min=sum;
				if(min>sum) {
					min=sum;
				}
		}
 	}		
		System.out.println(min);
 		
	}
}
