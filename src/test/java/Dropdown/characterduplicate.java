package Dropdown;

import java.util.HashSet;
import java.util.Set;

public class characterduplicate {

	public static void main(String[] args) {

		String s = "RRRRRR";
		char[] a = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < a.length; i++) {
			if (!set.contains(a[i])) {
				set.add(a[i]);
			}
		}

		for (char c : set) {
			System.out.println(c);
		}

	}

}
