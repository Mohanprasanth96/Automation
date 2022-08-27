package org.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

     public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\'origin\']/span/input"));
		
		from.sendKeys("POLLACHI");
    
        WebElement to =	driver.findElement(By.xpath("//*[@id=\'destination\']/span/input"));
		
	    to.sendKeys("CHENNAI EGMORE");
	    
     
     }
	
}
