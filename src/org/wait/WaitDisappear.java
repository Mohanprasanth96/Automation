package org.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDisappear {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/disapper.html");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			WebElement button = driver.findElement(By.xpath("//button[@id='btn']//b"));
	               
	        wait.until(ExpectedConditions.textToBePresentInElement(button, "I'm going to disapper.Keep looking at me !!"));
	        
	        String text = button.getText();
		    System.out.println(text);



	}

}
