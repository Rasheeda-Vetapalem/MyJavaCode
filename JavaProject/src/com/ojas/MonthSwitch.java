package com.ojas;

import java.util.Scanner;

//Accept the month name using 3 characters in switch statement
public class MonthSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the month name: ");
		String s=sc.next();
		String res="";
		switch(s){
		case "jan":
		case "Mar":
		case "july": 
		case "Agust":
		case "May": 
			 res = s+ " has 31 days";
             break;
			
		                  
		case "Feb": res = s+ " has 28 days";
                          break;
              
		case "Aprial":              
		case "june": res = s+ " has 30 days";
                             break;
                             
		
		}
     System.out.println(res);
	}

}
