package Dropdown;

public class goodcharacter {

	public static void main(String[] args) {

		String s="aaahb";
		int b=s.length();
		System.out.println(checkvowel(s, b));
	}

	public static boolean isvowel(char c) {

		String vowel = "aeiou";

		return vowel.contains(String.valueOf(c));
	}

	public static String checkvowel(String s, int n) {
		StringBuilder build = new StringBuilder();
		s = s.toLowerCase();

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);

			if (isvowel(c)) {
				build.append(c);
			} else {
				if (i > 0 && isvowel(s.charAt(i - 1))) {
					build.append(c);
				} else if (i < n - 1 && isvowel(s.charAt(i + 1))) {
					build.append(c);
				}

			}

		}

		return build.toString();
	}

}
