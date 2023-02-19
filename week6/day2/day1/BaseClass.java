package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;

	@Parameters({"username", "password", "url"})
	@BeforeMethod
	public void preCondition(@Optional("DemoCSR") String uName, @Optional("crmsfa")String pwd, @Optional("http://leaftaps.com/opentaps/") String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="FetchData")
	public String[][] sendData() throws IOException {
		return ReadExcel.readDataFromExcel(fileName);
	}
}
