package week3.day1;

public class MyBank {

	public static void main(String[] args) {
		// Cannot create an object for interface
//		ReserveBank myBank = new ReserveBank();
		
		AxisBank myBank = new AxisBank();
		myBank.knowYourCustomer();
		myBank.withdrawlLimit();
		
		ICICIBank bank = new ICICIBank();
//		int withdrawlLimit = bank.withdrawlLimit();
//		System.out.println(withdrawlLimit);
		bank.knowYourCustomer();
		
		// cannot create object for Abstract class
//		ABCBank b = new ABCBank();
//		b.getRepoRate();
		
		ABCBankChennai cheBank = new ABCBankChennai();
		cheBank.getRepoRate();
		cheBank.createAccount();
		cheBank.knowYourCustomer();
		
	}

}
