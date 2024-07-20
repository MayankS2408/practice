package Dropdown;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class nlargestnumberinarray {

	public static void main(String[] args) {

//		int[] arr = { 4, 2, 9, 7, 5, 6, 7, 1, 3 };
//		int k = 4;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//
//				}
//			}
//		}
//
//		System.out.println(Arrays.toString(arr));
//
//	}
//	

		List<Integer> list = Arrays.asList(4, 2, 9, 7, 5, 6, 7, 1, 3);

		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
		Optional<Integer> listing = list2.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst();
		System.out.println(listing);
	}

}
