package com.patterns;

import java.util.HashSet;
class Emp{
	int eno;
	String ename;
	public Emp() {
		super();
	}
	public Emp(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public int hashCode(){
		return this.eno;
	}
	@Override
	public String toString() {
		return "Emp [enp=" + eno + ", ename=" + ename + "]";
	}
	public boolean equals(Object obj){
		Emp e=(Emp) obj;
		return this.eno==e.eno&&this.ename.equals(e.ename);
	}
	
}
public class LLEmployee {

	public static void main(String[] args) {
		HashSet<Emp> empSet=new HashSet<Emp>();
		Emp e1=new Emp(10,"Anu");
		Emp e2=new Emp(10,"Anu");
		Emp e3=new Emp(12,"sai");
		Emp e4=new Emp(13,"Rashi");
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.forEach(System.out::println);
		
		
		
	}

}
