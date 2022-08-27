package org.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement firstname  = driver.findElement(By.xpath("//input[@id='firstName']"));
		js.executeScript("arguments[0].setAttribute('value','Mohan')",firstname);

		WebElement lastname  = driver.findElement(By.xpath("//input[@id='lastName']"));
		js.executeScript("arguments[0].setAttribute('value','prasanth')",lastname);
		
		WebElement email  = driver.findElement(By.xpath("//input[@id='userEmail']"));
		js.executeScript("arguments[0].setAttribute('value','mohanprasanth27@gmail.com')",email);
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		js.executeScript("arguments[0].click()",gender);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		js.executeScript("arguments[0].setAttribute('value','9677680225')",mobile);
				
		WebElement subject = driver.findElement(By.xpath("//div[@class='css-12jo7m5 subjects-auto-complete__multi-value__label']"));
		js.executeScript("arguments[0].setAttribute('value','physics')",subject);
		
		WebElement sports= driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		js.executeScript("arguments[0].click()",sports);
		
		WebElement address = driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[8]//textarea"));
		address.sendKeys("bellampatti");
	}

}
