package methods;

public class PrimeNumber {
	static boolean primeNumberDisplay(int number,int value) {
		if(number<=2) {
			return number==2?true:false;
		}
		if(number%value==0) {
			return false;
		}
		if(value*value>number) {
			
		return  true;
	}
		return primeNumberDisplay(number, value+1);
	}
	public static void main(String[] args) {
		System.out.println(primeNumberDisplay(17,2));

	}

}
