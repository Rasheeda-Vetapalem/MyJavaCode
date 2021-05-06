package mayuri;

public class CheckPalindrome {
	static boolean checkPalindrome(int num) {
		boolean b = false;
		int rem = 0, rev = 0, temp = num;
		while(num > 0) {
			rem = num % 10;
			rev = (rev * 10)+rem;
			num = num / 10;
		}
		if(temp == rev) {
			b = true;
		}
		return b;
	}
	static boolean isOdd(int num) {
		boolean b = false;
		if(num % 2 != 0) {
			b = true;
		}
		return b;
	}
	static String rangePalindrome(int startValue,int endValue) {
		String res = "";
		for(int i = startvalue)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
