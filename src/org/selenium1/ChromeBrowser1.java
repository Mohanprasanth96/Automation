package org.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com/");
	    driver.get("www.flipkart.com/");
	}

}
