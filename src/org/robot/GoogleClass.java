package org.robot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Actions acc = new Actions(driver);
		
		WebElement googleapp = driver.findElement(By.xpath("//a[@class='gb_A']"));
		acc.click(googleapp).perform();
		
		driver.switchTo().frame("app");
		WebElement gmailapp = driver.findElement(By.xpath("(//a[@class='tX9u1b'])[7]"));
		acc.click(gmailapp).perform();


	}

}
