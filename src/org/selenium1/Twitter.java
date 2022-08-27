package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://twitter.com/login");
			
			WebElement user = driver.findElement(By.name("text"));
			
			user.sendKeys("Mohan prasanth");
			
		    WebElement pass =	driver.findElement(By.name("pass"));
			
		    pass.sendKeys("mohan96");
	}

}
