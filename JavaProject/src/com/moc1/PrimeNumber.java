package com.moc1;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 7;
		boolean temp = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				temp = true;
				break;
			}
		}

		if (!temp)
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number ");

	}

}
