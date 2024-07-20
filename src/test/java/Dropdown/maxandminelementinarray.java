package Dropdown;

public class maxandminelementinarray {

	public static void main(String[] args) {

		int[] a = { 3, 2, 4, 6, 3, 8 ,1};
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}

		}

		System.out.println(max);
		System.out.println(min);
	}

}
