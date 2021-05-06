package com.ojas;

public class SmallestNum {

	public static void main(String[] args) {
		String res="";
		if(args.length != 3){
			res+="Invalid number";
			res+="Enter three values";
			System.out.println(res);
			return;
		}
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		if(num1<num2) {
			if(num1<num3) {
			res+=num1 + "is small";
		         }
			
			else {
				res+=num3 + "is small";
			   }
			
	          }
		else
		{
			if(num2<num3) {
				res+=num2 + "small";
			}
			else
			{
				res+=num3 + "is small";
			}
		}
		System.out.println(res);
	}
}
