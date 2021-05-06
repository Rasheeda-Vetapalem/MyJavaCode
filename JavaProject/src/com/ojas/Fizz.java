package com.ojas;

import java.util.Scanner;

public class Fizz {

	public static void main(String[] args) {
		System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String res=""; 
	if(num%3==0 && num%5==0){
		res = res + "FizzBizz";
	}
	else if(num%5==0){
		res = res + "Bizz";
	}
	else if(num%3==0) {
		res = res + "Fizz";
	}
	else{
		res = res+num;
	}
	System.out.println(res);
	}

}
