package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
		String s = "amazon development centre";
		// a=2, m=2, z=1, o=2

		Map<Character, Integer> occ = new HashMap<Character, Integer>();

		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (occ.containsKey(charArray[i])) {
				int existingCount = occ.get(charArray[i]);
				occ.put(charArray[i], existingCount + 1);
			} else {
				occ.put(charArray[i], 1);
			}
		}
		System.out.println(occ);

	}

}
