package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ArrayToMap {

	public static void main(String[] args) {
		System.out.println("Enter size of the array");
		Scanner sc = new Scanner(System.in);
		String[] str = new String[sc.nextInt()];
		for (int i = 0; i < str.length; i++) {
			System.out.println("Enter name " + (i + 1));
			str[i] = sc.next();
		}
		if (str.length == 0) {
			System.out.println("null");
		} else {
			Map<Integer, String> map = convertToMap(str);
			for (Map.Entry<Integer, String> s : map.entrySet()) {
				System.out.println(s.getKey() + " " + s.getValue());
			}
		}
	}

	public static Map<Integer, String> convertToMap(String[] names) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		int num = 1;
		for (int i = 0; i < names.length; i++) {
			map.put(num, names[i]);
			num++;
		}
		return map;
	}
}