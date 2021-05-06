package assignment;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int temp;
	   int rev=0;
		while(number>0){
		int	number1 = number % 10;
			rev = rev * 10+ number1 ;
			number1 = number / 10;
		}
		System.out.println(rev);
		temp = rev;
		if(temp==number){
			System.out.println("true");
		}
		else
			System.out.println("false");
}
}