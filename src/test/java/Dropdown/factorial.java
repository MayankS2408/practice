package Dropdown;

public class factorial {

	public static void main(String[] args) {

		int a = 5;
		System.out.println(fact(a));

	}

	public static int fact(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

}
