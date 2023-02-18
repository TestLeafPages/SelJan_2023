package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(priority = 3)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(priority = 2, enabled = false)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	@Test(invocationCount = 5, threadPoolSize = 2)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
