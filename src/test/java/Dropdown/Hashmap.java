package Dropdown;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Mayank");
		map.put(2, "Sharma");
		map.put(3, "Nothing");

		int key = 2;
		String val = "Nothing";

		System.out.println(map);

		boolean a = map.containsKey(key);
		boolean b = map.containsValue(val);

		System.out.println(a);
		System.out.println(b);

	}

}
