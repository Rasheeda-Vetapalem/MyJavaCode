package com.moc1;

import java.util.Scanner;

public class BiggestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements into the array");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		int max=array[0];
		for(int i=0;i<size;i++){
		if(array[i]>max){
			max=array[i];
		}
		}
		System.out.println("The maximum element is"+max);
	}
}
