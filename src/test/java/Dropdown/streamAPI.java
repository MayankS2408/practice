package Dropdown;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamAPI {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15,17);
		Optional<Integer> listing = numbers.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst();
		System.out.println("Second largest number is" + " " + listing);
	}

}
