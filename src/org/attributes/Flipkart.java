package org.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {  

	public static void main(String[] args) {
		 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
	    WebElement mobile =	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    mobile.sendKeys("9677680225");
	    String attribute= mobile.getAttribute("value");
		System.out.println(attribute);
	    
	    
        WebElement pass =	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	    pass.sendKeys("Mohan@45");
	    String attribute1= pass.getAttribute("value");
		System.out.println(attribute1);

        WebElement login =	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    login.click();
	    
	}
}
       