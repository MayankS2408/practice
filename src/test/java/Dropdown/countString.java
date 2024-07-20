package Dropdown;

public class countString {

	public static void main(String[] args) {

		int count = 0;
		String a = "abc,bc,xyz";

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)!=' '&& a.charAt(i)!=',') {
                count++;
			}
		}
		System.out.println(count);
	}

}
