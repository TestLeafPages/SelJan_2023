package week1.day2;

public class WordCount {

	public static void main(String[] args) {
		String str = "Amazon Developement Centre, Chennai";
		
		String[] split = str.split(" ");
		
		int length = split.length;
		System.out.println(length);
		
		System.out.println(split[1]);
		
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
	}

}
