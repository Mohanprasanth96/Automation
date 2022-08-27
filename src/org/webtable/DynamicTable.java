package org.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
	
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			WebElement island = driver.findElement(By.xpath("//td[text()='Island Trading']//following::td[2]"));
			System.out.println(island.getText());

			WebElement uk = driver.findElement(By.xpath("//td[text()='UK']//preceding::td[1]"));
			System.out.println(uk.getText());

			WebElement itly = driver.findElement(By.xpath("//td[text()='Giovanni Rovelli']//following-sibling::td[1]"));
			System.out.println(itly.getText());

			WebElement amazon = driver.findElement(By.xpath("//td[text()='Giovanni Rovelli']//preceding-sibling::td[1]"));
			System.out.println(amazon.getText());

			WebElement parent = driver.findElement(By.xpath("//td[text()='Meta']//parent::tr"));
			System.out.println(parent.getAttribute("style"));
			
			WebElement grantp = driver.findElement(By.xpath("//td[text()='Meta']//ancestor::table"));
			System.out.println(grantp.getAttribute("id"));

			WebElement starts = driver.findElement(By.xpath("//td[starts-with(text(),'Francisco ')]"));
			System.out.println(starts.getText());

			WebElement contains = driver.findElement(By.xpath("//td[contains(text(),'Chang')]"));
			System.out.println(contains.getText());

			WebElement contains1 = driver.findElement(By.xpath("//table[contains(@id,'customers')]"));
			System.out.println(contains1.getAttribute("id"));



	
	}

}
