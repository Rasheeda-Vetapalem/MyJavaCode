package mayuri;

public class Multiplication {
	static String dispTable(int num) {
		String res = "";
		for(int i = 1;i <= num;i++) {
			res += num + " * " + i + " = " + (num * i);
			res += "\n";
		}
		return res;
	}
	static String rangeOfTables(int startValue,int endValue) {
		String res = "";
		for(int i = startValue; i <= endValue; i++) {
			res += dispTable(i);
			res +="\n";
			res +="**********************\n";
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rangeOfTables(1,12));

	}

}
