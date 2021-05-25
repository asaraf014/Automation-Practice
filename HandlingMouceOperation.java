package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouceOperation {

	public static void main(String[] args) throws InterruptedException
	{
       WebDriver driver=BrowserFactory.launchbrowser("chrome");
       driver.get("https://www.flipkart.com/");
      // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElement(By.xpath("//button[text()='✕']")).click();
       WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
       Actions act=new Actions(driver);
       act.moveToElement(fashion).perform();
       Thread.sleep(5000);
       driver.findElement(By.linkText("Men's T Shirts Price List")).click();
       
	}

}
