package com.nit.pro1;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		//declare the variables
		int i,j,size,rotate,temp,arr[];
		//create scanner Object for reading input from console
		Scanner  scanner=new Scanner(System.in);
		try {
			
			System.out.println("Enter Size for Array");
			//reading size given by user
			 size=scanner.nextInt();
			 arr=new int[size];
			 
			 //getting all element one by one from console
			 System.out.println("Enter Element for Array");
			 for ( i = 0; i < arr.length; i++) {
				arr[i]=scanner.nextInt();
			}
			 // print all element one by one on console
			 System.out.println("Arrays Element...");
				for( i=0;i<arr.length;i++) {
					System.out.print(arr[i]+"  ");
				}
				
			System.out.println("\nEnter Number For Left Rotation");
			//input for left rotation
			rotate=scanner.nextInt();
			 //left rotation logic
				for(i=0;i<rotate;i++) {
					temp=arr[0];
					for(j=0;j<arr.length-1;j++) {
						arr[j]=arr[j+1];
					}
					arr[j]=temp;
				}
			
			//printing rotating array elements
			 System.out.println("Left Rotation Arrays Element...");
				for(i=0;i<arr.length;i++) 
					System.out.print(arr[i]+"  ");
				
		}catch (Exception e) {
			System.out.println("Enter Only Integer Number..::"+e.toString());
		}finally {
			scanner.close();
		}
	}
}
