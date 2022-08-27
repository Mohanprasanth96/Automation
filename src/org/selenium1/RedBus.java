package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/ ");
		
		WebElement from = driver.findElement(By.id("src"));
		
		from.sendKeys("udumalpet");
		
	    WebElement to =	driver.findElement(By.id("dest"));
		
	    to.sendKeys("Chennai");
	    

	}

}
