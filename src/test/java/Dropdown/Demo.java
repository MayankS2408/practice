package Dropdown;

import java.util.ArrayList;

public class Demo {

	public static void main(String args[]) {

		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Chikoo");
		fruits.add("Orange");
		System.out.println(fruits);

		java.util.Iterator<String> s = fruits.iterator();
//		while(s.hasNext());
		System.out.println(s.hasNext());

	}
}
