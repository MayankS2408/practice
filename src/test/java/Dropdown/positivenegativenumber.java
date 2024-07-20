package Dropdown;

public class positivenegativenumber {

	public static void main(String[] args) {

		int[] a = { 9, 32, 12, -9, -7, 54, 32 };
		int poscount = 0;
		int negacount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				poscount++;
			} else {
				negacount++;
			}
		}
		
		System.out.println(poscount);
		System.out.println(negacount);

	}

}
