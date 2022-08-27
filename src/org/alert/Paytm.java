package org.alert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://paytm.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			
			

	}

}
