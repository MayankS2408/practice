package Dropdown;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Team {

	public static void main(String[] args) {

		List<Player> map = Arrays.asList(new Player("Mayank", 98), new Player("Shivam", 78), new Player("Himansh", 67),
				new Player("Ram", 100), new Player("Harman", 88));

		String a = map.stream().collect(Collectors.maxBy(Comparator.comparing(Player::getScore))).get().getName();
		System.out.println(a);

		List<Player> li = map.stream().filter(e -> e.getScore() > 75).collect(Collectors.toList());
		System.out.println(li);

		List<Player> li2 = map.stream().filter(e -> e.getName().startsWith("H")).collect(Collectors.toList());
		System.out.println(li2);

		Double salary = map.stream().collect(Collectors.averagingDouble(Player::getScore));
		System.out.println(salary);

		List<String> listing = map.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(listing);

		Optional<Integer> g = map.stream().map(Player::getScore).distinct() // Ensure distinct salaries
				.sorted(Comparator.reverseOrder()) // Sort in descending order
		    	.skip(1) // Skip the first two highest salaries
				.findFirst();
		System.out.println(g);

	}

}
