package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertSBI {

	public static void main(String[] args)
	{
      WebDriver driver=BrowserFactory.launchbrowser("chrome");
      driver.get("https://retail.onlinesbi.com/retail/login.htm");
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.findElement(By.className("login_button")).click();
      driver.findElement(By.id("Button2")).click();
      Alert alt=driver.switchTo().alert();
     
      System.out.println("alert Msg is : "+alt.getText());
      alt.accept();
      
      driver.findElement(By.id("username")).sendKeys("username");
	}

}
