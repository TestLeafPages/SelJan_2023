package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindUnique {

	public static void main(String[] args) {
		String companyName = "Google"; // output: "gole"
		
		char[] charArray = companyName.toLowerCase().toCharArray();
		Set<Character> unique = new HashSet<Character>();
		String output =""; // gole
		
		for (int i = 0; i < charArray.length; i++) {
			boolean add = unique.add(charArray[i]);
			if (add) {
				output = output + charArray[i];
			}
		}
		
		System.out.println(unique);
		System.out.println(output);
		
		
	}

}
