package Dropdown;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stringcompare {

	public static void main(String[] args) {

//		String a = "Mayank";
//		String b = "Sharma";
//
//		Set<Character> set = new HashSet<>();
//		StringBuilder bf = new StringBuilder();
//		for (char c : b.toCharArray()) {
//			set.add(c);
//		}
//		for (char d : a.toCharArray()) {
//			if (!set.contains(d)) {
//				bf.append(d);
//			}
//		}
//        System.out.println(bf.toString());
//	}

		String a = "Mayank";
		String b = "Sharma";
          boolean found=false;
		StringBuilder bf= new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				char c = a.charAt(i);
				char d = b.charAt(j);
				
				if(c==d) {
					found=true;
					break;
				}
			}
			if(!found) {
				
			}
		}
		
	}
}
