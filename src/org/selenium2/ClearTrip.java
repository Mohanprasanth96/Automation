package org.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		
		register.click();
		
	    WebElement email =	driver.findElement(By.xpath("//input[@id='username1']"));
		
	    email.sendKeys("mohanprasanth27@gmail.com");
	    
	    WebElement creat = driver.findElement(By.xpath("//button[@id='registerButton']"));
	    
	    creat.click();
	    
	    
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	    
	    pass.sendKeys("Mohan@1996");
	    
        WebElement title = driver.findElement(By.xpath("//select[@id='profile_title']"));
	    
	    title.sendKeys("Mr");
	    
        WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	    
	    firstname.sendKeys("Mohan");
	    
        WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	    
	    lastname.sendKeys("prasanth");
	    
        WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_number_value']"));
	    
	    mobile.sendKeys("9677680225");
	    
        WebElement signup = driver.findElement(By.xpath("//button[@id='signUpButton']"));
	    
	    signup.click();
	    
	    


	}

}
