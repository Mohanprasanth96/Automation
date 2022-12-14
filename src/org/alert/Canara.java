package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canara {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        WebElement signin = driver.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
        signin.click();
        Alert alert = driver.switchTo().alert();
	    String text = alert.getText();		
        alert.dismiss();
	    System.out.println(text);

	}

}
