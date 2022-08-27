package org.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			WebElement userdummy = driver.findElement(By.name("DUMMY1"));
			userdummy.click();
			
			WebElement username = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
			username.sendKeys("9677680225");
			
			WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
			pass.sendKeys("Mohan21996");
			
			WebElement checkbox = driver.findElement(By.id("AuthenticationFG.REMEMBER_USERID_CHECKBOX"));
			checkbox.click();
			
			WebElement login = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
			login.click();
			

	}

}
