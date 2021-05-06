package methods;

import java.util.Scanner;

public class Lcm {
static void displayLcm(int number1,int number2) {
	int loop = 2;
	for (int i = 1; i < loop; i++) {
		if(i % number1 == 0 && i % number2 == 0){
			System.out.println(i);
			break;
		}
		loop++;
	}
}
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");*/
		//int value=sc.nextInt();
		displayLcm(30,45);
	}
}
