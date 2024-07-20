package Dropdown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class generaterandomnumber {

	public static void main(String[] args) {

		String str = "My name is Mayank Sharma";
		String lower = str.toLowerCase();

		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
		long print=lower.chars().mapToObj(c -> (char) c).filter(list::contains).count();
		System.out.println(print);

	}

}
