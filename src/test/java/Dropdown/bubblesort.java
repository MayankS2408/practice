package Dropdown;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {

		int[] a = { 4, 8, 9, 6, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
        String res="";
        for(int v=0;v<a.length;v++) {
        	res=res+a[v];
        }
        
        System.out.println(res);
	}

}
