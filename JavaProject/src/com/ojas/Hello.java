package com.ojas;

abstract class Demo{
	abstract void m1();
Demo(){
	System.out.println("Hello");
}
}
public class Hello extends Demo implements Hii{
public void method(){
	System.out.println("Welocome");
}
void m1(){
	System.out.println("Rasheeda");
}
	public static void main(String[] args) {
		Hello h=new Hello();
		h.method();
        h.m1();
	}

}
