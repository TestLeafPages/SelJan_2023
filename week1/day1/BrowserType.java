package week1.day1;

public class BrowserType {

	public static void main(String[] args) {
		String browser = "Safari";
		
		// Java >= 1.7 (int and String)
		switch (browser) {
		case "Chrome":
			System.out.println("Google");
			break;
		case "Firefox":
			System.out.println("Mozilla");
			break;
		case "Edge":
			System.out.println("Microsoft");
			break;
		case "Safari":
			System.out.println("Apple");
			break;
		default:
			System.out.println("Not a valid browser");
			break;
		}
	}

}
