package Dropdown;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicatelist {

	public static void main(String[] args) {

		int a[] = { 1, 5, 2, 1, 3, 9, 5, 8, 3 };

		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		for (int s : a) {
			if (!set.contains(s)) {
				set.add(s);
			} else {
				set1.add(s);
			}

		}
		System.out.println(set1);
		System.out.println(set);

	}

}
