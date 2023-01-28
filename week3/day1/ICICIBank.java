package week3.day1;

public class ICICIBank implements ReserveBank, Cibil{

//	@Override
//	public int withdrawlLimit() {
//		return 1000000;
//	}

	@Override
	public void knowYourCustomer() {
		System.out.println("Aadhar");
	}

	public int maxLoanAmount() {
		return 500000;
	}

	@Override
	public void getRepoRate() {
		
	}

	@Override
	public void getCreditScore() {
		
	}

}
