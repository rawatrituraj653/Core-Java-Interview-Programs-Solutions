package com.nit.find.same;

public class FindSameElement {

	public static void main(String[] args) {
		/*
		 * int [] arr1= {1, 5, 10, 20, 40, 80}; int [] arr2= {6, 7, 20, 80, 100}; int []
		 * arr3= {3, 4, 15, 20, 30, 70, 80, 120};
		 / 
		  */
	int arr1[] = {1, 5, 9};
	int	arr2[] = {3, 4, 5, 9, 10};
	int	arr3[] = {5, 9, 10, 20};

		int i,j,k;
		for(i=0;i<arr1.length;i++) {
		  for(j=0;j<arr2.length;j++) {
			  for(k=0;k<arr3.length;k++) {
				  
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]){
				System.out.println("This is similar element:: "+arr1[i]);
			}	  
		    }
		  }	
		}
	}
}
