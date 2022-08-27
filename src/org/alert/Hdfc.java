package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.switchTo().frame("login_page");
		WebElement cont = driver.findElement(By.linkText("CONTINUE"));
		cont.click();
		
	    Alert alert = driver.switchTo().alert();
	    String text = alert.getText();		
		alert.accept();
	    System.out.println(text);

		
				
				
	   

	}

}
