package com.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee2 implements Comparable {
	int eno;
	String ename;

	public Employee2() {
		System.out.println("default constructure");
	}

	public Employee2(int eno, String ename) {
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
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class DemoCompare2 {
	public static void main(String[] args) {
		List<Employee1> empList=new ArrayList<Employee1>();
		Employee1 e=new Employee1(1,"Rashi");
		Employee1 e1=new Employee1(5,"Vani");
		Employee1 e2=new Employee1(3,"Rani");
		Employee1 e3=new Employee1(4,"harika");
		Employee1 e4=new Employee1(6,"yaminni");
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