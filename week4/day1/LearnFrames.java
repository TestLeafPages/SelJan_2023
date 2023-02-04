package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement eleFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
		
		// Switch to 1st frame
		driver.switchTo().frame(eleFrame);
		
		// Switch to inner frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		// Switch back to main window
		driver.switchTo().defaultContent();
		
		// Come out of only one frame
		driver.switchTo().parentFrame();
		
		
	}

}
