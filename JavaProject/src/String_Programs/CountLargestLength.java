package String_Programs;

import java.util.Scanner;

public class CountLargestLength {
	static int largestLength(String str1) {
		str1=str1.toLowerCase();
		int temp=0;
		for(int i=0;i<str1.length();i++) {
			int count=1;
			for(int j=i+1;j<str1.length();j++) {	
				
			if(str1.charAt(i)!=str1.charAt(j)){	
						break;
			}
		count++;
		}
			if(count>temp) {
				temp=count;
			}
		}
		return temp;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
	System.out.println(largestLength(sc.next()));
	}

}
