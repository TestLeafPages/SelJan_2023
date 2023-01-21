package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxInteractions {

	public static void main(String[] args) {
//		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		// Append Text
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" Madurai");
		
		WebElement ele = driver.findElement(By.id("j_idt88:j_idt95"));
		ele.clear();
		ele.sendKeys("some text");
		
		// to retrive the text present in text field
		String value = ele.getAttribute("value");
		
		System.out.println(value);
		
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);
		
		boolean selected = ele.isSelected();
		
		boolean displayed = ele.isDisplayed();
	}

}
