package com.ojas;

public class AbsValue {

	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	
	if(num<0){
		num=-num;
	}
		System.out.println(num);
	}
	

}
