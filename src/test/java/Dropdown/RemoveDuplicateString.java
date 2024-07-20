package Dropdown;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		String s = "Mayyank";
		String v = s.substring(2, 5);
		System.out.println(v);
		Set<Character> a = new HashSet<>();
		Set<Character> b = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (!a.contains(ch)) {
				a.add(ch);
			} else {
				b.add(ch);
			}
		}
		System.out.println((a));
		System.out.println(b);
	}
}
