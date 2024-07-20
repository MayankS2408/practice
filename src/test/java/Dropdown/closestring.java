package Dropdown;

import java.util.ArrayList;
import java.util.List;

public class closestring {

	public static void main(String[] args) {

		String s1 = "abcb";
		String s2 = "bcaa";

		System.out.println(clstring(s1, s2));

	}

	public static boolean clstring(String s, String s2) {

		int n = s.length();
		int m = s2.length();

		if (n != m) {
			return false;
		}

		List<Integer> f1 = new ArrayList<>(26);
		List<Integer> f2 = new ArrayList<>(26);

		for (int i = 0; i < 26; i++) {
			f1.add(i);
			f2.add(i);
		}

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			char b = s2.charAt(i);
			int idx = c - 'a';
			int idx2 = b - 'a';
			f1.set(idx, f1.get(idx) + 1);
			f2.set(idx2, f2.get(idx2) + 1);
		}

		for (int i = 0; i < 26; i++) {
			if (!f1.equals(f2)) {
				return false;
			}
		}
		return true;
	}

}
