package Dropdown;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 3, 84, 24 };
		int sum = 0;
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			if (i == arr.length - 2) {
				System.out.println("Second Largest number is" + "=" + arr[i]);
			}

		}
		System.out.println("The sum of array is" + "=" + sum);
	}

}
