package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
//		WebDriverManager.firefoxdriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		
		// Identify the Select tag element
		WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));
		
		// Create an object for Select class
		Select dd = new Select(eleTool);
		
		// Select the option
		// using index
//		dd.selectByIndex(1);
		
		// using the visible text
		dd.selectByVisibleText("Playwright");
		
		// using value attribute
//		dd.selectByValue("");
		
		// to get the options available in dropdown
		List<WebElement> options = dd.getOptions();
		
//		for(int i=0; i < options.size(); i++) {
//			WebElement option = options.get(i);
//			String text = option.getText();
//			System.out.println(text);
//		}
		
//		for (WebElement eachOption : options) {
//			System.out.println(eachOption.getText());
//		}
		
		WebElement firstSelectedOption = dd.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

}
