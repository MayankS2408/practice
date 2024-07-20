package Dropdown;

public class concatestring {

	public static void main(String[] args) {

		String s = "Mayank";
		String s1 = "l";

		if (s.length() != s1.length()) {
			System.out.println("Not able to rotaate");
		} else {
			s = s + s;
			if (s.contains(s1)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}

	}

}
