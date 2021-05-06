package com.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HTDemo {

	public static void main(String[] args) {
		//ArrayList<String> al=new ArrayList<String>();
		
		String strArray[]={"Ramu","sita","vani"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(strArray));
		al.add("Rashi");
		al.add("madhuri");
		//Collections.addAll(al, strArray);
		Collections.synchronizedList(al);//convert nonSysn to syn
		al.forEach(System.out::println);
		
	}

}
