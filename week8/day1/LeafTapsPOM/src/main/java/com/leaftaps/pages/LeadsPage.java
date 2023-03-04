package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecificActions;

public class LeadsPage extends ProjectSpecificActions{

	public LeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads() {
		
		return new FindLeadsPage(driver);
	}
}
