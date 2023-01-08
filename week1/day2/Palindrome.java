package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String name = "Madam";
		String rev = "";
		
		// rev = m + a --> ma + d --> mad --> mad + a --> mada --> madam

		char[] charArray = name.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		
		// == It does a comparision of the memory
		if (name.equalsIgnoreCase(rev)) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
