package week3.day1;

public class AxisBank implements ReserveBank{

	public int withdrawlLimit() {
		return 500000;
	}

	@Override
	public void knowYourCustomer() {
		System.out.println("PAN");
	}

	@Override
	public void getRepoRate() {
		
	}

}
