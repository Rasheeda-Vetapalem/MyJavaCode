package mayuri;

public class NumberOfDigits {
	static int noOfDigitsInNumber(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num = num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(noOfDigitsInNumber(153));

	}

}
