package Dropdown;

public class palindrome {

	public static void main(String[] args) {

		int num = 131;
		int temp = num;
		int rev = 0;

		while (num != 0) {
			int mod = num % 10;
			rev = rev * 10 + mod;
			num = num / 10;
		}

		System.out.println(rev);
		if (temp == rev) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("No palindrome");
		}
	}

}
