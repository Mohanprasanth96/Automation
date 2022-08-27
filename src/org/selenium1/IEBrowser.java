package org.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\IEDriverServer.exe");
	    
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://demoqa.com/registration/");
	}
}
