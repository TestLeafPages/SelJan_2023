package com.leaftaps.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leaftaps.utils.ReadExcel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificActions {

	public RemoteWebDriver driver;
	public String fileName;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="FetchData", indices = 0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readDataFromExcel(fileName);
	}
}
