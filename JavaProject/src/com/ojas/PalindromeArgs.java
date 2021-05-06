package com.ojas;

public class PalindromeArgs {
public static void main(String[] args){
	
	int num = 0,rev=0;
	num=Integer.parseInt(args[0]);
	int num1=num%10;
	rev=num/100;
	System.out.println(num1==rev);
	
    }
}
