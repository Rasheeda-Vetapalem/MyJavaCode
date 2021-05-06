package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Rasheeda", "Rasheeda", "Rani", "sita", "gita");

		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctElements);
	}

}
