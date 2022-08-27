package org.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args)  {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
        WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		alert.click();
		
		WebElement register = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		
		register.click();
    
        
	    

	}

}
