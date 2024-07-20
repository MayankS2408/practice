package Dropdown;

public class charactersinstring {

	public static void main(String[] args) {

		String a = "Mayank is good boy ";

		System.out.println(words(a));
	}

	public static int words(String str) {

		if (str == null || str.isEmpty()) {
			return 0;

		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return str.length()-count;
		
	}

}
