package challenges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFluentWait {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/waits.xhtml;jsessionid=node0n20urdtnrq6919ix7ktg5wcvs400589.node0");
		
		driver.findElement(By.xpath("//h5[contains(text(),'Wait for Visibility')]/following::span")).click();
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		
		  Wait wait = new FluentWait(driver) .withTimeout(Duration.ofSeconds(2))
		  .pollingEvery(Duration.ofMillis(250)) .ignoring(Exception.class);
		 
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//span[text()='I am about to hide']"))));
		
		driver.findElement(By.xpath("//span[text()='I am about to hide']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
