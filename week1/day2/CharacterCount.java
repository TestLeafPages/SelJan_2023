package week1.day2;

public class CharacterCount {

	public static void main(String[] args) {
		String company = "testleaf";
		char expected = 'e';
		
		int count = 0;
		for (int i = 0; i < company.length(); i++) {
			if (company.charAt(i) == expected) {
//				count = count+1;
				count++;
			}
		}
		System.out.println(count);
	}

}
