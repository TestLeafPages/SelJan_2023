package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// Non- primitive Datatype
		// for a sequence of characters --> String
		
		// String literal (String Pool Memory)
		String name = "  Testleaf  ";
		
		// String Object (Heap Memory)
		String comName = new String("QEagle");
		
		// convert to char array
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		// to get the number of chars
		int length = name.length();
		System.out.println(length);
		
		// to check if a sequence of chars is present in String
		boolean contains = name.contains("Leaf");
		System.out.println(contains);
		
		// convert String to uppercase or lowercase
//		name = name.toUpperCase();
//		name = name.toLowerCase();
		
		// && - AND, || - OR
		if(name.contains("leaf") || name.contains("Leaf")) {
			System.out.println("leaf is present");
		}
		
		// get a partial string
		String substring = name.substring(4);
		System.out.println(substring);
		
		String substring2 = name.substring(0, 4);
		System.out.println(substring2);
		
		// get the index of a char
		int indexOf = name.indexOf('e');
		System.out.println(indexOf);
		
		// to remove trailing or leading spaces
		String trim = name.trim();
		System.out.println(trim);
	}

}
