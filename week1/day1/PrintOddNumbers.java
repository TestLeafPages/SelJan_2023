package week1.day1;

public class PrintOddNumbers {

	public static void main(String[] args) {

		for (int i = 1; i < 21; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
