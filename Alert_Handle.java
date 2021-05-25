package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert_Handle {

	public static void main(String[] args)
	{
       WebDriver driver=BrowserFactory.launchbrowser("chrome");
       driver.get("https://www.softwaretestingmaterial.com/handle-multiple-windows-using-selenium-webdriver/");
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       
//       Alert alt= driver.switchTo().alert();
//       alt.dismiss();
       
       driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
       
	}

}
