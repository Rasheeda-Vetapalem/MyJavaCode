package mayuri;

import java.util.Scanner;

public class ReverseOfNatural {
	static void reverseOfNatural(int num) {
		for(int i = num; i >= 1;i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		reverseOfNatural(num);
		System.out.println("hello");
		
		

	}

}
