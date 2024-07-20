package Dropdown;

public class target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 4, 5 ,6};
		int target = 11;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				sum = a[j] + a[i];
				if (sum == target) {
					System.out.println("True");
					return;
				}

			}

		}
		System.out.println("false");

	}

}
