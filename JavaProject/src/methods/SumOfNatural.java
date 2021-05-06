package methods;

import java.util.Scanner;

public class SumOfNatural {
 static int sumOfNatural(int number) {
	// System.out.println(sum);
	 if(number==1) {
		 return 1;
	 }
	 System.out.println(number);
	 return number+sumOfNatural(number-1);
 }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
		System.out.println(sumOfNatural(number));

	}

}
