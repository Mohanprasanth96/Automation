package org.attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BesantTech {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.besanttechnologys.co");
		
		
	

	}

}
