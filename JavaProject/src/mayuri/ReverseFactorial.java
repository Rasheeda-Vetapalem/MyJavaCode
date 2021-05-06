package mayuri;

public class ReverseFactorial {
	static String findFactorial(int number) {
		String res = "";
		int fact = 1;
		while(number >= 1) {
			res+= number+ "*";
			fact = fact * number;
			number--;
		}
		return res.substring(0,res.length()-1) +"=" + fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorial(5));
		

	}

}
