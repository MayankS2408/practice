package Dropdown;

import java.util.Arrays;
import java.util.Collections;

public class str {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		String s = "ab12pq39";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isDigit(c)) {
				int value = Character.getNumericValue(c);
				;
				sum = sum + value ;
				System.out.println(value);
			}

		}

		System.out.println(sum);
	
		int[]a= {8,5,9,4,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}
}