package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		Thread.sleep(500);
		fromStation.sendKeys(Keys.ENTER);
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MAS");
		Thread.sleep(500);
		toStation.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainsList = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody//td[2]"));
		List<String> trainNames = new ArrayList<String>();
		
		for (WebElement train : trainsList) {
			trainNames.add(train.getText());
		}
		
//		for (int i = 0; i < trainsList.size(); i++) {
//			trainsList.get(i).getText();
//		}
		
		Set<String> trains = new HashSet<String>(trainNames);
		
		if(trainNames.size() == trains.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Duplicates present");
		}
		
	}

}
