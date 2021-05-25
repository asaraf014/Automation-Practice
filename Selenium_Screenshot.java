package Selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Selenium_Screenshot {

	public static void main(String[] args)
	{
        WebDriver driver=BrowserFactory.launchbrowser("chrome");
        driver.get("https://www.selenium.dev/");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        File destFile=new File("./screenshot/FirstScreenshot.png");
        try {
			Files.copy(srcFile, destFile);
		    } 
        catch (Exception e) 
        {
        	e.printStackTrace();
		}
        System.out.println("Screenshot has been taken");
	}

}
