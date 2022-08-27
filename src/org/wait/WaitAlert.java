package org.wait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAlert {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/alertappear.html");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement button = driver.findElement(By.id("alert"));
	        button.click();
	        
	        wait.until(ExpectedConditions.alertIsPresent());
	        
	        Alert alert = driver.switchTo().alert();
		    alert.accept();
	}

}
