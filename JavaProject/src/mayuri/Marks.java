package mayuri;

import java.util.Arrays;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int marks[] = new int[5];
//		System.out.println("Enter" + marks.length + " sub marks ?");
//		Scanner sc = new Scanner(System.in); 
//		for(int i = 0;i < marks.length;i++) {
//			marks[i] = sc.nextInt();
//		}
		disMarks(args);
		
		

	}

	//static void disMarks(String names[]) {
	static String disNames(char name[]) {
		Arrays.sort(name);
		System.out.println("Name");
		
		// TODO Auto-generated method stub
//		int sum = 0;
//		System.out.println("Marks as follows");
////		for(int i = 0;i<marks.length;i++) {
////			System.out.println(marks[i]);
////			sum = sum+marks[i];
//		for( int x : marks) {
//			System.out.println(x);
//			sum = sum + x;
//		}
//		System.out.println("Sum of marks:"+sum);
//		
//		 System.out.println("Names:");
//		 for(String x: names) {
//			 System.out.println(x);
//		 }
	}

}
