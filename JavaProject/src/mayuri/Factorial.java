package mayuri;

import java.util.Scanner;

public class Factorial {
	static int factorial(int num) {
		if(num == 1) {
			return 1;
		}
		else {
			return num * factorial(num-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(factorial(num));
		
		

	}

}
