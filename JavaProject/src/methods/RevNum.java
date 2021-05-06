package methods;

import java.util.Scanner;

public class RevNum {
	static String reverseOfNumber(int number) {
		int rev=0, rem = 0;
		String res="";
		while(number > 0 ) {
			rem = number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		return res+=rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
	System.out.println(reverseOfNumber(number));

	}

}
