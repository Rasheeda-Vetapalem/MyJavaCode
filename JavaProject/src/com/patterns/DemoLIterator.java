package com.patterns;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoLIterator {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("ramu");
		list.add("harika");
		list.add("Rasheeda");
		list.add("Sandhya");
		
		ListIterator<String> listitr=list.listIterator();
		System.out.println("forward direction");
		while(listitr.hasNext()){
			System.out.println(listitr.next());
		}
		System.out.println("backward direction");
		while(listitr.hasPrevious()){
			System.out.println(listitr.previous());
		}
	}

}
