package com.discuss;

public class B extends A {
 
	public void show(){
		System.out.println("hello");
	}
public static void main(String[] args) {
	A a=new B();
	a.show();
}
}
