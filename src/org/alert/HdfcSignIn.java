package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcSignIn {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			driver.switchTo().frame("login_page"); 
			
			WebElement id = driver.findElement(By.name("fldLoginUserId"));
			id.sendKeys("234567");
			
			WebElement cont = driver.findElement(By.linkText("CONTINUE"));
			cont.click();
			
			WebElement pass = driver.findElement(By.id("fldPasswordDispId"));
			pass.sendKeys("Mohan@1996");
			
			WebElement login = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
			login.click();
			
		    Alert alert = driver.switchTo().alert();
		    String text = alert.getText();		
			alert.dismiss();
		    System.out.println(text);
	}

}
