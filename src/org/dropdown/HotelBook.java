package org.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBook {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91967\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	        
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://adactin.com/HotelApp/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
            WebElement user = driver.findElement(By.id("username"));
			user.sendKeys("9677680225");
			
		    WebElement pass =	driver.findElement(By.name("password"));
		    pass.sendKeys("mohan@96");
		    
		    WebElement login = driver.findElement(By.id("login"));
		    login.click();
			
			WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
	        Select sc = new Select(location);
	        sc.selectByIndex(2);
	        
	        WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
	        Select sc1 = new Select(hotel);
	        sc1.selectByIndex(2);
	        
	        WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
	        Select sc2 = new Select(roomtype);
	        sc2.selectByIndex(2);
	        
	        WebElement roomno = driver.findElement(By.xpath("//select[@id='room_nos']"));
	        Select sc3 = new Select(roomno);
	        sc3.selectByIndex(2);
	        
	        WebElement adultroom  = driver.findElement(By.xpath("//select[@id='adult_room']"));
	        Select sc4 = new Select(adultroom);
	        sc4.selectByIndex(2);

	        WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
	        Select sc5 = new Select(childroom);
	        sc5.selectByIndex(2);
	        
	        WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
	        search.click();
	        
	        WebElement select = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	        select.click();
	        
	        WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
	        cont.click();
	        
	        WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
	        firstname.sendKeys("Mohan");
	        
	        WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
	        lastname.sendKeys("prasanth");

	        WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
	        address.sendKeys("abcxyx");
	        
	        WebElement creditcardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
	        creditcardno.sendKeys("123456789123456");
	        
	        WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	        Select sc6 = new Select(cardtype);
	        sc6.selectByIndex(2);
	        
	        WebElement selectmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	        Select sc7 = new Select(selectmonth);
	        sc7.selectByIndex(2);

	        WebElement selectyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	        Select sc8 = new Select(selectyear );
	        sc8.selectByIndex(2);
	        
	        WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	        cvv.click();
	        
	        WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
	        book.click();
	        
	        Thread.sleep(10000);

	        WebElement Myitenary = driver.findElement (By.id("my_itinerary"));
	        Myitenary.click();
	       
	        WebElement order = driver.findElement(By.xpath("(//input[@class='select_text'])[1]"));
	        
	        String text = order.getAttribute("value");
	        System.out.println("orderno. "+text);


	        
	        
	        

	        


	        
	        
	        
	        

	        

	        
	        


	        
	        
	        


	}

}
