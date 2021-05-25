package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Text {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        List<WebElement> allTags = driver.findElements(By.tagName("a"));
        System.out.println("All tags are : "+allTags.size());
        for(int i=0;i<allTags.size();i++)
        {
        	System.out.println("All the Links are : "+allTags.get(i).getText());
        }
	}

}
