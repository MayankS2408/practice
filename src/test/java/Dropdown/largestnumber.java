package Dropdown;

import java.util.HashSet;
import java.util.Set;

public class largestnumber {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		int[] a = { 45, 76, 87, 45 };

		for (int d : a) {
			if (!set.contains(d)) {
				set1.add(d);
			}
		}
		System.out.println(set1);
		System.out.println(set);
	}

}
