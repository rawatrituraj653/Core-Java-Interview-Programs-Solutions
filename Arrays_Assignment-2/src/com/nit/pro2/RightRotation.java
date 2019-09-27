package com.nit.pro2;

import java.util.Scanner;

public class RightRotation {
		
	public static void main(String[] args) {
		int size,i,j,rotate,temp;
		Scanner  scan=new Scanner(System.in);
		try {
			System.out.println("Enter Number For Array Size");
			size=scan.nextInt();
		   int arr[] =new int[size];
		   
		   //get element through scanner
		   System.out.println("Enter Element one By one");
		   for(i=0;i<arr.length;i++) {
			   arr[i]=scan.nextInt();
		   }
		   // print all element one by one on console
			 System.out.println("Arrays Element...");
				for( i=0;i<arr.length;i++) {
					System.out.print(arr[i]+"  ");
				}
			
		   
		   System.out.println("\nEnter Number Where you Want Right Rotation");
		   rotate=scan.nextInt();
		   for(i=0;i<rotate;i++) {
			   temp=arr[arr.length-1];
			   for(j=arr.length-1;j>0;j--) {
				   arr[j]=arr[j-1];
			   }
			   arr[0]=temp;
		   }
		   
		   System.out.println("All Elemnts Are....  ");
		   for(i=0;i<arr.length;i++) {
			   System.out.print(arr[i]+"  ");
		   }
		   
		   
		   
			
		}catch (Exception e) {
			System.out.println("Enter Only Integers..."+e.toString());
		}finally {
			scan.close();
		}
		
	}
}
