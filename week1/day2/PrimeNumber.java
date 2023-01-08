package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		boolean bPrime = true;
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("It is not a Prime Number");
				bPrime = false;
				break;
			}
		}
		
		if(bPrime == true) {
			System.out.println("Prime Number");
		}
		
	}

}
