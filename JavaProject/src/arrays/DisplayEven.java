package arrays;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class DisplayEven {
int i;
public Vector<Integer> dispEvenNos(int start,int end){
	Vector<Integer> v=new Vector<Integer>();
	for(int i=start;i<=end;i++){
	if(i%2==0){
		System.out.println(i);
	}
	}
	return v;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start and End value");
		int s=sc.nextInt();
		int e=sc.nextInt();
		DisplayEven d= new DisplayEven();
		Vector<Integer> v=d.dispEvenNos(s,e);
		//v.forEach(x->System.out.println(x));
		
		Enumeration<Integer> e1=v.elements();
		while(e1.hasMoreElements()){
			System.out.println(e1.nextElement());
		}
	}
}
