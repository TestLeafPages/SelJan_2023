package week1.day2;

public class FindVowels {

	public static void main(String[] args) {
		String name = "GOOGLE";
		name = name.toLowerCase();
		
		// vowels --> a, e, i, o, u
		
		/*
		 * 1. Break the word into the characters
		 * 2. Check if the character is a vowel
		 * 3. It it matches, print it
		 */
		
//		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a'
					|| name.charAt(i) == 'e'
					|| name.charAt(i) == 'i'
					|| name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				System.out.println("Vowel: " + name.charAt(i));
			}
		}
	}

}
