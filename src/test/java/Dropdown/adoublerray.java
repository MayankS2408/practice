package Dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class adoublerray {

	public static void main(String[] args) {

		int common = 0;
		List<Integer> list = new ArrayList<>();
		int[] a = { 2, 3, 4, 5, 6 };
		int[] b = { 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					common=a[i];
					list.add(a[i]);
				}
			}
		}
		System.out.println(list);//Will give all common element
		System.out.println(common);//Will give only Single element 
		
//		Random random=new Random();
//		random.ints(5).limit(1).forEach(System.out::println);
	}

}
