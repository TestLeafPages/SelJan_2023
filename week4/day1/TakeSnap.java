package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/lg.png");
		FileUtils.copyFile(source, dest);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Open']"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/ele.png");
		FileUtils.copyFile(src, des);
	}

}
