package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecificActions;

public class LoginPage extends ProjectSpecificActions {
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}

	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}
