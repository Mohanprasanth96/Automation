package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) {
	   
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("www.adactin.com/HotelApp/");
			
			WebElement user = driver.findElement(By.id("username"));
			
			user.sendKeys("Mohan");
			
		    WebElement pass =	driver.findElement(By.name("password"));
			
		    pass.sendKeys("mohan96");
		    
		    WebElement login = driver.findElement(By.id("login"));
		    
		    login.click();

	}

}
