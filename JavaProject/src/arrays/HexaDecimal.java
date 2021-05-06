package arrays;

import java.util.Scanner;

public class HexaDecimal {
	static void convertHexa(int number) {
		String res = "";
		
		while (number > 0) {
			
			int number1;
			
			
//			for (int i = number1; i >0 ; i--) {
//				//number1 = number /16;
//				res += number1;
//			}
			number1 = number % 16;
			if (number1 == 10) {
				res += "A";
			}
			else if (number1 == 11) {
				res += "B";
			}
			else if (number1 == 12) {
				res += "C";
			}
			else if (number1 == 13) {
				res += "D";
			}
			else if (number1 == 14) {
				res += "E";
			}
			else if (number1 == 15) {
				res += "F";
			}
			else{
				res += number1;
			}
			number = number / 16;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		convertHexa(number);
	}

}
