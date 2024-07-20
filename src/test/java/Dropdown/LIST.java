package Dropdown;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LIST {

	public static void main(String[] args) {

		List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(2,3,4),Arrays.asList(4,5,6));
		Integer max=list.stream().flatMap(List::stream).distinct().max((a,b)->a.compareTo(b)).get();
		System.out.println(max);
//		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

//		Stream<Integer> steam = Stream.concat(list.stream(), list2.stream());
//		steam.forEach(System.out::print);
		
		
		
	}

}
