package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	System.out.println("Enter the elements");
	int[] array = new int[size];
	for(int index=0;index<=array.length-1;index++){
		array[index]=sc.nextInt();
	}
		for(int index=0;index<=array.length-1;index++) {
			
			for(int j=index+1;j<=array.length-1;j++) {
				
				if(array[index] > array[j ]) {
					
					int temp=array[index];
						array[index]=array[j ];
						array[j ]=temp;
						
				}
			}
			
		}
		for(int index=0;index<=array.length-1;index++) {
			System.out.println(array[index]);
		}
		

	}

}
