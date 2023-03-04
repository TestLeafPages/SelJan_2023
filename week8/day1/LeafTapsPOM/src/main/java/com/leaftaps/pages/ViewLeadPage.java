package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecificActions;

public class ViewLeadPage extends ProjectSpecificActions {

	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public void verifyFirstName(String fName) {
		if (driver.findElement(By.id("viewLead_firstName_sp")).getText().equals(fName)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Unable to create lead");
		}
	}

	public void clickEdit() {

	}
}
