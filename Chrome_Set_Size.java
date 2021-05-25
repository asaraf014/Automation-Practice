package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Set_Size
{
			
		    public static void main(String[] args)
		    {
		    	
		    	WebDriver driver=BrowserFactory.launchbrowser("chrome");
//		    	System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
//		        WebDriver driver = new ChromeDriver();
		    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        driver.navigate().to("http://www.softwaretestingmaterial.com");
		        System.out.println(driver.manage().window().getSize());
		        //Create object of Dimensions class
		        Dimension d = new Dimension(480,620);
		        //Resize the current window to the given dimension
		        driver.manage().window().setSize(d);
		        System.out.println(driver.manage().window().getSize());
		     }	
		
}


