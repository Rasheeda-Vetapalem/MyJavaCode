package com.moc1;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements into the array");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
		 sum=sum+array[i];
		}
		System.out.println(sum);
	}

}
