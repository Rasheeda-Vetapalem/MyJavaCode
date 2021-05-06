package com.moc2;

class Test {
	static int fact(int num) {
		int result;
		if (num == 1) {
			return 1;
		}
		return result = fact(num - 1) * num;
	}
}

public class Factorial {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.fact(5));
	}

}
