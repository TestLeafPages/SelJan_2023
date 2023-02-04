package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Click on simple alert button
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span[text()='Show']")).click();
		
		// Switch to Alert
		Alert alert = driver.switchTo().alert();
		
		// Get the text before accept/ dismiss
		System.out.println(alert.getText());
		
		// Accept alert
//		alert.accept();
		
		// enter text
		alert.sendKeys("ABCD");
		
//		Thread.sleep(3000);
		
		// Dismiss alert
		alert.accept();
		
	}

}
