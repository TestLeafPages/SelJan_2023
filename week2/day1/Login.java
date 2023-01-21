package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// Setup the driver (WebDriverManager)
//		WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		// Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// Enter the username
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		driver.findElement(By.name("submitButton")).click();
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		
		if(firstName.equalsIgnoreCase("Haja")) {
			System.out.println("FirstName is correct");
		} else {
			System.out.println("FirstName is incorrect");
		}
		
		driver.close();
	}

}
