package methods;

public class StrongNumber {
	static void strongNumber(int number) {
		
	
		int number1 = 0; 
		int sum = 0;
		while (number !=0) {
			int fact = 1;
			number1 = number % 10;
			for (int i = number1; i >=1; i--) {
				fact = fact * i;
			}
			
			sum = sum + fact;
			number = number / 10;
			
			
		}
		System.out.println(sum);
	
	}
	public static void main(String[] args) {

		strongNumber(145);
		// System.out.println(result);
	}

}
