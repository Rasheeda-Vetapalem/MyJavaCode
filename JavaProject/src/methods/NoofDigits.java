package methods;

public class NoofDigits {
	static void noOfdigits(int number) {
		int count= 0;
		if(number==1) {
			return;
		
	}
		while(number>0) {
			count++;
			//number=number1%10;
			number=number/10;
			
		}
		
		System.out.println(count);

	}
	
	public static void main(String[] args) {
		
			noOfdigits(2);
	}

}
