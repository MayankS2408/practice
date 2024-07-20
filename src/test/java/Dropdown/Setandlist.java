package Dropdown;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setandlist {

	public static void main(String[] args) {

		int a[] = { 1, 5, 2, 1, 3, 9, 5, 8, 3 };

		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (!set.contains(a[i])) {
				set.add(a[i]);
			} else {
				list.add(a[i]);
			}

		}
		System.out.println(list);
		System.out.println(set);

	}

}
