package Dropdown;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Integerlist {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> listing = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());// EVEN NUMBER
		System.out.println(listing);
		int list2 = list.stream().mapToInt(e -> e * e).sum();
		System.out.println(list2);// SUM OF SQUARE
		List<Integer> list3 = list.stream().map(e -> e * 2).collect(Collectors.toList()); // Double each digit
		System.out.println(list3);
		List<Integer> list4=list.stream().sorted((e1,e2)->-e1.compareTo(e2)).collect(Collectors.toList());
        System.out.println(list4);
	}

}
