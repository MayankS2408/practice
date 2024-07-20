package Dropdown;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class minmaxlist {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 45, 98, 87, 44, 34, 23);
		Integer min = list.stream().min((a, b) -> -a.compareTo(b)).get();
		System.out.println(min);
		Integer max = list.stream().max((a, b) -> -a.compareTo(b)).get();
		System.out.println(max);

		Consumer<Integer> c = i -> System.out.println(i.doubleValue());

		list.stream().forEach(c);

	}

}
