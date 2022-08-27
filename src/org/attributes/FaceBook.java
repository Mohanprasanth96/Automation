package org.attributes;

import java.awt.Frame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("mohanprasanth27@gmail.com");
		String attribute= email.getAttribute("value");
		System.out.println(attribute);
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("mohan@1996");
		String attribute1= pass.getAttribute("value");
		System.out.println(attribute1);
		
	    WebElement login = driver.findElement(By.name("login"));   
		login.click();


	}

}
