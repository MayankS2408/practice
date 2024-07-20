package Dropdown;

public class specialcharacters {

	public static void main(String[] args) {

		String java = "My1Name is@Mayank";
		char[] ch = java.toCharArray();

		int letters = 0;
		int whitespace = 0;
		int digit = 0;
		int specials = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isAlphabetic(ch[i])) {
				letters++;
			} else if (Character.isDigit(ch[i])) {
				digit++;
			} else if (Character.isWhitespace(ch[i])) {
				whitespace++;
			} else {
				specials++;
			}

		}
		System.out.println(letters);
		System.out.println(digit);
		System.out.println(whitespace);
		System.out.println(specials);

	}

}
