package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sprint {

	public static void main(String[] args) {
	     
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sprint.com/");
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement consprint = driver.findElement(By.linkText("Continue to Sprint"));
        consprint.click();
	    WebElement submit= driver.findElement(By.xpath("//button[@id='loginHeaderButton']"));
        submit.click();
	    
	    


	}

}
