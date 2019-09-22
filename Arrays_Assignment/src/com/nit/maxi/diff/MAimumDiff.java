package com.nit.maxi.diff;

public class MAimumDiff {

	public static void main(String[] args) {
	maximumDiffInArrayElements();
		
}

	private static void maximumDiffInArrayElements() {
		int arr[]= { 2, 5, 1, 7, 3, 9, 5};
				//{ 9, 2, 12, 5, 4, 7, 3, 19, 5};
		int temp=0,temp1=0,diff=0,subTemp=0,i,j;
		for (i=0;i<arr.length;i++) {
			temp=arr[i];
			for(j=0;j<arr.length;j++) {
				temp1=arr[j];
				subTemp=temp-temp1;
				if(diff<subTemp) 
					diff=subTemp;
			}		
		}	
		System.out.println(diff);
	}
}
