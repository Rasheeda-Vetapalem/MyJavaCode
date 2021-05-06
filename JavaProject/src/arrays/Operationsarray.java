package arrays;


import java.util.Scanner;

public class Operationsarray {
	
	static void menu() {
		String m="Menu choice is\n";
		m+="1.Insert\n";
		m+="2.display\n";
		m+="3.delete\n";
	}
	static int size=5;
	static int array[] = new int[size];
	static void insert(int number) {
	System.out.println("enter the array elements");
	for(int index=1;index<array.length-1;index++) {
		System.out.println(array[index]); 
	}
	}
	static void display() {
		for(int index=0;index<array.length-1;index++) {
			System.out.println(array[index]);
		}
	}
	
	static void delete() {
	for(int index=0;index<array.length-1;index++) {
		array[index]=array[index+1];
		System.out.println(array[index]);
	}
}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		while(true) {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
		
			case 1:
					System.out.println("Enter any value");
					insert(sc.nextInt(3));
					break;
			case 2:
				    display();
					break;
			case 3:
				      delete();
						break;
			default :
				System.out.println("invalid number");
			}
	
		}
		}
}
