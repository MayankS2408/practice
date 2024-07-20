package Dropdown;

public class maxarray {

	public static void main(String[] args) {

		int a[] = { 20, 45, 32, 67, 30 };

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];

			}

		}
		System.out.println(max);
	}
	}
	

