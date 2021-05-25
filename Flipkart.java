package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart {

	public static void main(String[] args)
	{
       WebDriver driver=BrowserFactory.launchbrowser("chrome");
       driver.get("https://www.flipkart.com/");
//       String sessionId = driver.getWindowHandle();
//       System.out.println(sessionId);
       driver.findElement(By.xpath("//button[text()='✕']")).click();

       
       // WebElement username = driver.findElement(By.className("_2IX_2- VJZDxU"));
        
       // username.sendKeys("9453615708");
	}

}
