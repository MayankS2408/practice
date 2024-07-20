package Dropdown;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a = "danger";
		String b = "garden";

		char[] c = a.toUpperCase().toCharArray();
		char[] d = b.toUpperCase().toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);

		if (c.length != b.length()) {
			System.out.println("Not Anagaram");
		}
		if (Arrays.equals(c, d)) {
			System.out.println("It is Anagram");
		}
	}

}
