package Dropdown;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commomelementinarray {

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 5, 6 };
		int[] b = { 2, 4, 6, 8 };

		Set<Integer> set = new HashSet<>();
		for (int n:a) {
			set.add(n);
		}
		for(int c:b) {
			if(set.contains(c)) {
				System.out.println(c);	
			}
			
		}
        
	}

}
