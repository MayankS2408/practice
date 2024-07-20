package Dropdown;

import java.util.HashSet;
import java.util.Set;

public class firstrepeatingeelement {

	public static void main(String[] args) {

		int[] a = {1,1,2,2,3,4};
		int fisrtrepeat = 0;

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i <= a.length-1; i++) {
			if (set.contains(a[i])) {
				fisrtrepeat = i;
				break;
			} else {
				set.add(a[i]);
			}
		}
       if(fisrtrepeat!=-1) {
    	   System.out.println(a[fisrtrepeat]);
       } else {
    	   System.out.println("Not found");
       }
		

	}

}
