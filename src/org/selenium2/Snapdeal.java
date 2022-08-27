package org.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement signin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		signin.click();
		
	    WebElement mobile =	driver.findElement(By.xpath("//input[@name='username'"));
			
		mobile.sendKeys("9677680225");
        
        WebElement cont = driver.findElement(By.xpath("//button[@id='checkUser']"));
		
		cont.click();
        
        WebElement email =	driver.findElement(By.xpath("//input[@id='username']"));
		
        email.sendKeys("prasanth27@gmail.com");
        
	}

}
