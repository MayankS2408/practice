package Dropdown;

import java.util.Arrays;

public class arrayequal {

	public static void main(String[] args) {

		long[] a = { 2, 3, 4, 6, 7 };
		long[] b = { 2, 6, 3, 4, 7 };
		int c = 5;
		System.out.println(check(a, b, c));

	}

	public static boolean check(long A[], long B[], int N) {

		if (A.length != B.length) {
			return false;
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));

		for (int i = 0; i < N; i++) {
			if (A[i] != B[i]) {
				return false;
			}
		}

		return true;
	}

}
