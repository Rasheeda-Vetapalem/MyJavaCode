package com.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable{
	int eno;
	String ename;
	
	public Employee1() {
		System.out.println("Defult constructure");
	}
	
	public Employee1(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public int compareTo(Object argo) {
		Employee1 e=(Employee1)argo;
		
		return this.eno-e.eno;
	}
	
}
public class DemoCompre {

	public static void main(String[] args) {
		List<Employee1> empList=new ArrayList<Employee1>();
		Employee1 e=new Employee1(1,"Rashi");
		Employee1 e1=new Employee1(2,"Vani");
		Employee1 e2=new Employee1(3,"Rani");
		Employee1 e3=new Employee1(4,"harika");
		Employee1 e4=new Employee1(5,"yaminni");
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		System.out.println("before sorting Emp data");
		empList.forEach(x->System.out.println(x.getEno()+" "+x.getEname()));
		Collections.sort(empList);
		System.out.println("After sorting emp data");
		
		empList.forEach(x->System.out.println(x.getEno()+" "+x.getEname()));
		
		
	}

}
