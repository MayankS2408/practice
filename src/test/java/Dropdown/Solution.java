package Dropdown;

import java.util.ArrayList;

public class Solution {
	static ArrayList<Integer> factorial(int N) {

		ArrayList<Integer> result = new ArrayList<>();

		if (N == 1) {
			result.add(1);
		} else {
			int res = N * factorial(N - 1).get(0);
			result.add(res);
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(factorial(8));
	}
}
