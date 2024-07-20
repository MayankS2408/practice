import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class string {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 1, 1, 3, 3 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}

		}
		System.out.println(map);

		Set<Integer> set = new HashSet<>();
		for (Integer value : map.values()) {
			set.add(value);
		}
			if (set.size() == map.size()) {
				System.out.println("Frequencies are unique");
			} else {
				System.out.println("Frequencies are not unique");
			}
		}
	}
