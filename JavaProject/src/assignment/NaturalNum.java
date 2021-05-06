package assignment;

import java.util.Scanner;

public class NaturalNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Start value");
	int startValue = sc.nextInt();
	System.out.println("Enter the End Value");
	int endValue = sc.nextInt();
	for(int index = startValue;index<= endValue ; index++) {
		System.out.println(index);
	}
}
}
