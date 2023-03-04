package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecificActions;

public class MyHomePage extends ProjectSpecificActions{

	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}
}
