package arrays;

import java.util.Scanner;

public class DecimalToBinary {
	 static String str = "";
     static void decimalBinary(int number) {
    	 int remainder = 0;
    	while(number!=0){
    		 remainder = number%2;
    		  number =  number/2;
    		 str+= remainder;
    	 }
     
    	for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
    	}	
     }
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number =  sc.nextInt();
		decimalBinary(number);
		sc.close();
	}

}
