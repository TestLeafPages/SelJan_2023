package week3.day1;

public abstract class ABCBankHQ implements ReserveBank {

	@Override
	public void knowYourCustomer() {
		System.out.println("Aadhar");
	}
	
	public void createAccount() {
		System.out.println("Account created");
	}
	
	public abstract void currentAccount();
}
