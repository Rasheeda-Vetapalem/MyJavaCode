package com.patterns;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashExamle {

	public static void main(String[] args) {
	Hashtable<String,String> ht=new Hashtable<String,String>();
	ht.put("Andhra pradesh","Amaravathi");
	ht.put("Telangana", "Telangana");
	ht.put("Goa", "panaji");
	ht.put("Mp", "Mp");
	ht.put("America", "Washingtone dc");
	Enumeration<String> keys=ht.keys();
	while(keys.hasMoreElements()){
		String k=(String)keys.nextElement();
		String v=ht.get(k);
		System.out.println(k+  " "+v);
	}
	}

}
