package org.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			Actions mouse = new Actions(driver);
			
			WebElement signin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			
			mouse.moveToElement(signin).build().perform();
			
            WebElement start = driver.findElement(By.xpath("//a[@class='nav-a']"));
			
			start.click();
			
			WebElement firstname  = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
			    
			firstname.sendKeys("Mohan");
			    
            WebElement mobile = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
			
		    mobile.sendKeys("9677680225");
		    
            WebElement email =	driver.findElement(By.xpath("//input[@id='ap_email']"));
			
	        email.sendKeys("prasanth27@gmail.com");
	        
	        WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
			
	        pass.sendKeys("Prasanth@1996");
	}
}
