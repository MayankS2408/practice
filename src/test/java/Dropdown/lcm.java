package Dropdown;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findlcm(2, 12));
	}

	public static int findgcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		return findgcd(b, a % b);
	}

	public static int findlcm(int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}
		return Math.abs(m * n) / findgcd(m, n);
	}

}
