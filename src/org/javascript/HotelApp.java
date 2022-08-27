package org.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.adactin.com/HotelApp/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement user = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','Mohan')",user);
    	String text =js.executeScript("return arguments[0].getAttribute('value')", user).toString();
		System.out.println(text);
	
		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','mohan@96')",pass);
	    String text1 =js.executeScript("return arguments[0].getAttribute('value')", pass).toString();
	    System.out.println(text1);
			
	    WebElement login = driver.findElement(By.id("login"));   
	    js.executeScript("arguments[0].click()",login);
	}

}
