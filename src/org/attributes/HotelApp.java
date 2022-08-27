package org.attributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {

	public static void main(String[] args) {
	    
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.adactin.com/HotelApp/ ");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement user = driver.findElement(By.id("username"));
		    user.sendKeys("Mohan prasanth");
			String attribute= user.getAttribute("value");
			System.out.println(attribute);
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("mohan@1996");
			String attribute1= pass.getAttribute("value");
			System.out.println(attribute1);
			
		    WebElement login = driver.findElement(By.id("login"));   
			login.click();

	}

}
