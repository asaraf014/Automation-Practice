package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException 
	{ 
		  System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	      driver.findElement(By.name("proceed")).click();
	      Thread.sleep(5000);
	      Alert alert =driver.switchTo().alert();
	      String text = alert.getText();
	      if(text.equals("Please enter a valid user name"))
	      {
	    	  System.out.println("Correct message alert");
	    	 
	      }
	      else
	      {
	    	  System.out.println("in -- Correct message alert");

	      }
	      alert.accept();// click on ok Button
	     // alert.dismiss();//click on cancel btn
	}

}
