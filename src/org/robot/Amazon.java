package org.robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
		Actions acc = new Actions(driver);
		
		WebElement signin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		acc.moveToElement(signin).build().perform();
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		acc.click();
		
		
			   
	}

}
