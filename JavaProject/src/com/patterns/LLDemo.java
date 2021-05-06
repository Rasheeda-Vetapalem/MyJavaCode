package com.patterns;

import java.util.LinkedList;

public class LLDemo {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Rashi");
	ll.add("vani");
	ll.add("Rani");
	ll.add("seetha");
	ll.addFirst("1");
	ll.addLast("harika");
	System.out.println();
	ll.removeFirst();
	ll.removeLast();
	System.out.println("after removing="+ll);
	ll.remove("vani");
	String st=ll.get(0);
	System.out.println(st);
	System.out.println("After change"+ll);
	
	
}
}
