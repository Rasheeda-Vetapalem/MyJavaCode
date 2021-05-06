package mayuri;

import java.util.Scanner;
public class BiggestOfArrayElements {
static int BiggestOfArrayElements(int num[]) {
	int res = 0;
	for(int i = 1;i <= num.length;i++) {
		int BiggestOfArrayElements = 0;
		if(num[i] > BiggestOfArrayElements) {
			BiggestOfArrayElements = num[i];
		
			
		}
	}
	return res;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements ?");
		for(int i = 0;i < number.length;i++) {
			number[i] = sc.nextInt();
		}
		System.out.println("Biggest value = "+BiggestOfArrayElements(number));
		
		

	}

}
