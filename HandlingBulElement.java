package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingBulElement {

	public static void main(String[] args) 
	{
       WebDriver driver=BrowserFactory.launchbrowser("chrome");
       driver.get("https://www.selenium.dev/downloads/");
       List<WebElement> allTags = driver.findElements(By.tagName("a"));
       System.out.println("Total links are present inside the page is = "+allTags.size());
	}

}
