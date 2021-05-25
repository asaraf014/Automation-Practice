package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile {

	public static void main(String[] args) 
	{
      WebDriver driver=BrowserFactory.launchbrowser("chrome");
      driver.get("http://demo.guru99.com/test/upload/");
      driver.findElement(By.id("uploadfile_0")).sendKeys("/home/akhter/A.jpeg");;
      driver.findElement(By.id("terms")).click();
      driver.findElement(By.id("submitbutton")).click();
	}

}
