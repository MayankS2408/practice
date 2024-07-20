package Dropdown;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 176, 45, 23);
		Optional<Integer> list2 = list.stream().reduce((a, b) -> a * b);
		List<String> list3 = list.stream().map(e -> e + " ").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		Optional<Integer> list4 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		int sum=list.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		
		
		
		List<String> string = Arrays.asList("CSK", "CSK", "RCB", "KKR");
		Map<String, Long> map=string.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(map);
	}
}
