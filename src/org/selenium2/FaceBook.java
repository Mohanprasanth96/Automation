package org.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
			
			user.sendKeys("Mohan prasanth");
			
		    WebElement pass =	driver.findElement(By.xpath("//input[@name='pass']"));
			
		    pass.sendKeys("mohan96");
		    
		    WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		    
		    login.click();

	}

}
