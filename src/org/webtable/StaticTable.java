package org.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			WebElement table = driver.findElement(By.id("customers"));
            System.out.println(table.getText());
            
            List<WebElement> row =  table.findElements(By.tagName("tr"));
            System.out.println(row.size());
            System.out.println(row.get(3).getText());
            
            List<WebElement> column =  table.findElements(By.tagName("th"));
            System.out.println(column.size());
            for (WebElement x : column)
            {
            	System.out.println(x.getText());
            }
	
            List<WebElement> company =  table.findElements(By.xpath("//table[@id='customers']//tr//td[1]"));
	
            for (WebElement y : company)
            {
            	System.out.println(y.getText());
            }

            WebElement value = driver.findElement(By.xpath("//table[@id='customers']//tr[4]//td[3]"));
	        System.out.println(value.getText());
	}
}
