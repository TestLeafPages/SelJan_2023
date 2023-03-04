package com.leaftaps.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificActions;
import com.leaftaps.pages.HomePage;
import com.leaftaps.pages.LoginPage;
import com.leaftaps.pages.MyHomePage;

public class TC001_CreateLead extends ProjectSpecificActions{

	@BeforeClass
	public void setData() {
		fileName = "CreateLead";
	}
	
	@Test(dataProvider = "FetchData")
	public void runCreateLead(String uName, String pwd, String cName,
			String fName, String lName) {
		
		System.out.println(driver);
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.verifyFirstName(fName);
		
//		lp.enterUserName();
//		lp.enterPassword();
//		lp.clickLogin();
//		
//		HomePage hp = new HomePage();
//		hp.clickCRMSFA();
//		
//		MyHomePage mp = new MyHomePage();
//		mp.clickLeads();
		
	}
}
