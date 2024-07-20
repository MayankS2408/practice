package Dropdown;

import java.util.Arrays;
import java.util.Stack;

public class reverseastringusingStack {

	public static void main(String[] args) {

		String str = "Mayank";
		char[] ch = str.toCharArray();
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (char c : ch) {
			stack.push(c);
		}

		while (!stack.isEmpty()) {

			result.append(stack.pop());

		}

		System.out.println(result.toString());

	}
}
