package com.patterns;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		String str[]={"bhanu","Anusha","Amith"};
		List<String> list=Arrays.asList(str);
		TreeSet<String> ts=new TreeSet<String>(list);
		ts.forEach(x->System.out.println(x));
	}

}
