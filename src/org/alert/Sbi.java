package org.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        WebElement logincon = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
        logincon.click();
        WebElement login= driver.findElement(By.xpath("//input[@id='Button2']"));
        login.click();
        Alert alert = driver.switchTo().alert();
	    String text = alert.getText();		
        alert.dismiss();
	    System.out.println(text);

	}

}
