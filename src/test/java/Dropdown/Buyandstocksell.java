package Dropdown;

public class Buyandstocksell {

	public static void main(String[] args) {

		int []a= {4,6,2,5,9};
		System.out.println(count(a));

	}

	public static int count(int[] a) {

		int maxprofit = 0;
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			min= Math.min(min, a[i]);
			int profit=a[i]-min;
			maxprofit=Math.max(maxprofit, profit);
		}
		return maxprofit;
	}

}
