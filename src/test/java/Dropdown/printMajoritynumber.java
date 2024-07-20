package Dropdown;

import java.util.HashMap;
import java.util.Map;

public class printMajoritynumber {

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 1, 1, 2, 2, 3, 5 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet())

			if (entry.getValue() > a.length / 2) {
				System.out.println(entry.getValue());
			}
	}

}
