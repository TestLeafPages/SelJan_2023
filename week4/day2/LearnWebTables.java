package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTables {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String firstData = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td[1]"))
				.getText();
		System.out.println(firstData);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));

		List<WebElement> allHeaders = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-header-box']//th"));
		
		String lastData = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + allRows.size() +"]/td[ " +allHeaders.size()+"]"))
				.getText();
		System.out.println(lastData);
		
		for (int i = 1; i <= allRows.size(); i++) {
			for (int j = 1; j <= allHeaders.size(); j++) {
				String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(data);
			}

		}
	}

}
