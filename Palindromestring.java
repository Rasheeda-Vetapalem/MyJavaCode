
import java.util.*;
import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		String rev="";
	   String temp;
		for(int i=n.length()-1;i>=0;i--){
			rev=rev+n.charAt(i);
			
		}
		System.out.println(rev);
		temp=rev;
		if(temp.equals(n)){
			System.out.println("Palindrome");
		}
		else
			System.out.println("not");
	}

}
