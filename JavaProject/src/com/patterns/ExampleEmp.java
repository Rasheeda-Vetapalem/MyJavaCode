package com.patterns;

import java.util.ArrayList;

class Employee {
	int empNo;
	String empName;

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}

}

class Student {
	int sno;
	String sname;

	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

}

public class ExampleEmp {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Employee(1, "Rasheeda"));
		list.add(new Employee(2, "samatha"));
		list.add(new Employee(3, "mamatha"));

		list.add(new Student(10, "Harika"));
		list.add(new Student(11, "ankitha"));
		list.add(new Student(12, "anusha"));

		list.add("phani");
		Object b[] = list.toArray();
		for (Object x : b) {
			// compare the objects we use instance
			if (x instanceof Employee) {
				Employee e = (Employee) x;
				System.out.println(e.empNo + "  " + e.empName);
			}

			if (x instanceof Student) {
				Student s = (Student) x;
				System.out.println(s.sno + " " + s.sname);
			}
			if (x instanceof String) {
				System.out.println(x.toString());
			}
		}

	}

}
