package com.moc2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}

}
