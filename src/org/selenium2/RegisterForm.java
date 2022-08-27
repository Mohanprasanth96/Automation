package org.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {

	public static void main(String[] args) {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		
		firstname.sendKeys("Mohan");
		
	    WebElement lastname =	driver.findElement(By.xpath("//input[@id='last-name']"));
		
	    lastname.sendKeys("Prasanth");
	    
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    
	    email.sendKeys("mohanprasanth27@gmail.com");
	    
        WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile']"));
	    
	    mobile.sendKeys("9677680225");
	    
        WebElement textarea = driver.findElement(By.xpath("//textarea[@class='upcoming_registration--input']"));
	    
	    textarea.sendKeys("Hi... i am Mohan prasanth");
	    
        WebElement signup = driver.findElement(By.xpath("//button[text()=/'send']"));
	    
	    signup.click();
	}
}
