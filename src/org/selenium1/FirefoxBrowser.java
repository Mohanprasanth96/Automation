package org.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
        
		WebDriver driver=new FirefoxDriver();
	
	   
	    driver.get("https://www.amazon.in");
	}

}
