package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Auth {

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      // https://username:password@link
     // Thread.sleep(4000);
      driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
      
      String pageMessage=driver.findElement(By.cssSelector("p")).getText();
      System.out.println(pageMessage);
      
	}

}
