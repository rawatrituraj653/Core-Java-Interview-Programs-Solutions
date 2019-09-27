package com.nit.pro7;

public class SortedArray {
	
	public static void main(String[] args) {
	int arr[]= {10, 20, 30, 40, 50, 60, 70,80, 90,100};
	int len=arr.length;
	int tempArr[]=new int [len], min=0,max=len-1,i;
	boolean flag=true;
	for(i=0;i<arr.length;i++) {
		if(flag) {
			tempArr[i]=arr[min++];
		}
		else {
			tempArr[i]=arr[max--];
		}
	flag=!flag;
	 }
	arr=tempArr;
	for(i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"  ");
	}
	
	
	}	
}
