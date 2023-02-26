package week7.day2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions {
	
	@Test
	public void test() {
		String name = "TestLeaf";
		String company = "Testleaf";
		
		// Hard Assertion
//		Assert.assertEquals(name, company);
//		Assert.assertTrue(name.equals(company));
//		Assert.assertFalse(name.contains(company));
		
		// Soft Assert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(name, company);
		sa.assertTrue(name.contains(company));
		System.out.println("Last line of code");
	
		sa.assertAll();
	}
	
}
