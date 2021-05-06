package com.moc2;

import java.util.Scanner;

public class QuadraticSequence {

	public static void main(String[] args) {
		int count=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		for(int i=1;i<=5;i++){
			sum = i * (i + 1) / 2;
			System.out.println(sum);
		}	
	
	}
}
