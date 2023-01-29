package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		WebElement firstLink = driver.findElement(By.tagName("a"));

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		System.out.println(allLinks.get(1).getText());
		
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		
	}

}
