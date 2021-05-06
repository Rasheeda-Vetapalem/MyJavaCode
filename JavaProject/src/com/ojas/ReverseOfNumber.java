package com.ojas;

public class ReverseOfNumber {
	static int reverseOfNumber(int num) {
		int rem = 0,rev = 0;
		while(num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseOfNumber(153));

	}

}

	