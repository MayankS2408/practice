package Dropdown;

public class rotateanarray {

	public static void main(String[] args) {

		int n = 3;
		int[] a = { 2, 6, 3, 5, 7 };
		for (int i = 0; i < n; i++) {
			int temp = a[0],j;
			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
