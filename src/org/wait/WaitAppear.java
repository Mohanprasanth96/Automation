package org.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAppear {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/appear.html");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
			
			WebElement button = driver.findElement(By.xpath("//button[@id='btn']"));
	               
	        wait.until(ExpectedConditions.visibilityOf(button));
	        
	        String text = button.getText();
		    System.out.println(text);


	}

}
