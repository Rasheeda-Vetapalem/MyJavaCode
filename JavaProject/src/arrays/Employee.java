package arrays;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee implements Serializable {
	int eno;
	String ename;
	double salary;

	public Employee(int eno, String ename, double salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Rashi", 23342.00));
		list.add(new Employee(2, "vani", 7765.00));
		list.add(new Employee(3, "sita", 5799.00));
		list.add(new Employee(4, "anu", 23742.00));
		list.add(new Employee(5, "rani", 25342.00));
		list.stream().filter(x->x.getSalary()>1000).forEach(System.out::println);
		//list.stream().sorted(Comparator.comparing(Employee::getEno)).forEach(System.out::println);
		//list.stream().sorted((emp1,emp2)->emp1.getEname().compareTo(arg0);
		
	}

}
