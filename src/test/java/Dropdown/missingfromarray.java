package Dropdown;

public class missingfromarray {

	public static void main(String[] args) {

		int sum = 0;
		int sum2 = 0;
		int[] a = { 1, 2, 4, 6, 5, 7, 8 };

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		for (int j = 1; j < 9; j++) {
			sum2 = sum2 + j;
		}

		System.out.println(sum2 - sum);
	}

}
