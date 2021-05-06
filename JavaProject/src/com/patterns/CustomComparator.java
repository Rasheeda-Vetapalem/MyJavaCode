package com.patterns;

import java.util.Comparator;
import java.util.TreeSet;
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
		//return -o1.compareTo(o2);
	}

	
	
}
public class CustomComparator {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>(new MyCompare());
		t.add("Rashi");
		t.add("Anusha");
		t.add("Harika");
		t.forEach(x->System.out.println(x));
	}

}
