package Dropdown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class graceinarray {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 45, 98, 87, 44, 34, 23);
		List<String> newlist=new ArrayList<>();
		
		List<Integer> failed = list.stream().filter(i -> i < 45).collect(Collectors.toList());
		System.out.println(failed);
		List<Integer> grace = failed.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(grace);
		
		
		newlist.add("Mayank");
		newlist.add("Sharma");
		List<String> newlist2=Collections.unmodifiableList(newlist);
		newlist2.add("Again");
		

	}

}
