import java.util.Arrays;

public class pushzerotoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 5, 0, 0, 0, 4 };
		int n = 5;

		pushZerosToEnd(a, n);
	}

	static void pushZerosToEnd(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j]==0 && arr[j+1]!=0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}
}
