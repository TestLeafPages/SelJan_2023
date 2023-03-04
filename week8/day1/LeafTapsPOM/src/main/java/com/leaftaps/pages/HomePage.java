package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecificActions;

public class HomePage extends ProjectSpecificActions {

	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
