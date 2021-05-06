package com.moc1;

import java.util.Scanner;

public class DisplayEvenno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements into the array");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(array[i]%2==0){
			System.out.println("even numbers are"+array[i]);
		}
		
		}
	}

}
