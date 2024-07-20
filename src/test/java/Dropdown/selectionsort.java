package Dropdown;

import java.util.Arrays;

public class selectionsort {

	public static void main(String[] args) {

		int[] a = { 6, 8, 5, 7, 65, 88 };
		int[] b = sort(a);

		System.out.println(Arrays.toString(b));

	}

	static int[] sort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;

		}
		return a;

	}

}
