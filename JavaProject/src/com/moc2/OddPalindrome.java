package com.moc2;

import java.util.Scanner;

public class OddPalindrome {

	static boolean checkPalindrom(int number) {
		boolean b = false;
		int rem = 0, rev = 0, temp = number;
		while (number > 0) {
			rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;
		}
		if (temp == rev) {
			b = true;
		}
		return b;
	}

	static boolean isOdd(int number) {
		boolean b = false;
		if (number % 2 != 0) {
			b = true;
		}
		return b;
	}

	static String rangePalindrom(int start_value, int end_value) {
		String res="";
		for (int i = start_value; i <= end_value; i++) {
			if (checkPalindrom(i) == true && isOdd(i) == true) {
				res += i + " ";
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter Range");
		Scanner sc = new Scanner(System.in);
		int start_value = sc.nextInt();
		int end_value = sc.nextInt();
		System.out.println(rangePalindrom(start_value, end_value));
	}
}