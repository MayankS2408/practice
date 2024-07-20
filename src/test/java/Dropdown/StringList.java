package Dropdown;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringList {

	public static void main(String[] args) {

		List<String>list=Arrays.asList("abhi","goluan","chand","ind");
		List<String> mylist=list.stream().sorted().collect(Collectors.toList());
		System.out.println(mylist); //ASCENDING ORDFER
		List<?> list2=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println(list2); //DESCENDING ORDER
		List<String> list3=list.stream().filter(e->!e.contains("an")).collect(Collectors.toList());
		System.out.println(list3);
		String list4=list.stream().collect(Collectors.joining("- "));
		System.out.println(list4);
		

	}

}
