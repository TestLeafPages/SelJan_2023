package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhones {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);

		List<WebElement> allPhonePrices = driver.findElements(By.className("a-price-whole"));
		List<Integer> allPrices = new ArrayList<Integer>();

		for (int i = 0; i < allPhonePrices.size(); i++) {
			System.out.println(allPhonePrices.get(i).getText());
			String singlePhonePrice = allPhonePrices.get(i).getText().replaceAll(",", "");
			if (!singlePhonePrice.equals("")) {
				int price = Integer.parseInt(singlePhonePrice);
				allPrices.add(price);
			}
		}

		Collections.sort(allPrices);
		System.out.println("Min Price: " + allPrices.get(0));
	}

}
