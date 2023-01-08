package week1.day2;

public class FindNumbers {

	public static void main(String[] args) {
		String data = "Amazon laid off 12,000 employees globally";
		
		String number = data.replaceAll("[^0-9]", "");
		System.out.println(number);
	}

}
