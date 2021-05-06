package com.moc1;

import java.util.Scanner;

public class StrongNumber {
	static int strongestNumber(int num) {
		int rem = 0, rev = 0, temp = num;

		while (num > 0) {

			int fact = 1;

			rem = num % 10;

			for (int i = rem; i >= 1; i--) {

				fact = fact * i;

			}

			rev = rev + fact;

			num = num / 10;

		}

		if (temp == rev) {

			System.out.println("strong number");

		} else {

			System.out.println("Not strong number");

		}

		return rev;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the enter:");

		int num = sc.nextInt();

		System.out.println("Strongest number:" + strongestNumber(num));
	}

}
