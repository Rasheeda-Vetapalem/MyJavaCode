package com.patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertToArray {

	public static void main(String[] args) {
		String strArray[]={"Ramu","sita","vani"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(strArray));
		Object b[]=al.toArray();
		for(Object x:b){
			System.out.println(x);
		}
	}

}
