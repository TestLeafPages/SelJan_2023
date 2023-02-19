package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(priority = 3, groups = "Sanity")
	public void createLead() {
		System.out.println("Create Lead");
		throw new RuntimeException();
	}
	
//	@Test(priority = 2, enabled = false)
	@Test(groups = {"Smoke", "Sanity"})
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
//	@Test(invocationCount = 5, threadPoolSize = 2)
//	@Test(dependsOnMethods = {"week6.day1.LearnAttributes.createLead", "editLead"})
	@Test(groups = "Regression")
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
}
