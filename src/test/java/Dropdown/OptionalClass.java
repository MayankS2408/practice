package Dropdown;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		String s="Mayank";
		
		Optional<String> opt= Optional.ofNullable(s);
		if(opt.isPresent()) {
			System.out.println(opt);
		} else {
			System.out.println("Empty");
		}
	}
	
}
